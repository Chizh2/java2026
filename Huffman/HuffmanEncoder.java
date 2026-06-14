import java.io.*;
import java.util.*;

public class HuffmanEncoder {
    private final Map<Byte, String> codes = new HashMap<>();
    public void encode(String inputFile, String outputFile) throws IOException {

        byte[] data = readFile(inputFile);

        int[] frequencies = new int[256];

        for (byte b : data) {
            frequencies[b & 0xFF]++;
        }

        Node root = buildTree(frequencies);

        if (root == null) {
            throw new IOException("Файл пуст.");
        }

        buildCodes(root, "");

        StringBuilder encodedBits = new StringBuilder();

        for (byte b : data) {
            encodedBits.append(codes.get(b));
        }

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)))) {

            for (int freq : frequencies) {
                out.writeInt(freq);
            }

            out.writeInt(encodedBits.length());

            int index = 0;

            while (index < encodedBits.length()) {
                int value = 0;
                for (int i = 0; i < 8; i++) {
                    value <<= 1;
                    if (index < encodedBits.length() && encodedBits.charAt(index) == '1') {
                        value |= 1;
                    }

                    index++;
                }

                out.writeByte(value);
            }
        }
    }

    private byte[] readFile(String fileName) throws IOException {
        File file = new File(fileName);

        byte[] data = new byte[(int) file.length()];

        try (FileInputStream in = new FileInputStream(file)) {
            in.read(data);
        }

        return data;
    }

    private Node buildTree(int[] frequencies) {
        PriorityQueue<Node> queue = new PriorityQueue<>();

        for (int i = 0; i < 256; i++) {
            if (frequencies[i] > 0) {
                queue.add(new Node((byte) i, frequencies[i]));
            }
        }

        if (queue.isEmpty()) {
            return null;
        }

        if (queue.size() == 1) {
            Node only = queue.poll();
            return new Node(only.frequency,only,null);
        }

        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();

            Node parent = new Node(left.frequency + right.frequency, left, right);

            queue.add(parent);
        }

        return queue.poll();
    }

    private void buildCodes(Node node, String code) {
        if (node == null) {
            return;
        }
        if (node.isLeaf()) {
            if (code.isEmpty()) {
                code = "0";
            }

            codes.put(node.symbol, code);
            return;
        }

        buildCodes(node.left, code + "0");
        buildCodes(node.right, code + "1");
    }
}
