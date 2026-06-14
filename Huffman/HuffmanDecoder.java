import java.io.*;
import java.util.*;

public class HuffmanDecoder {
    public void decode(String inputFile, String outputFile) throws IOException {
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile)))) {
            int[] frequencies = new int[256];

            for (int i = 0; i < 256; i++) {
                frequencies[i] = in.readInt();
            }

            int bitCount = in.readInt();

            Node root = buildTree(frequencies);

            if (root == null) {
                throw new IOException("Некорректный архив.");
            }

            ByteArrayOutputStream decoded =new ByteArrayOutputStream();
            Node current = root;
            int bitsRead = 0;

            while (bitsRead < bitCount) {
                int value = in.read();
                if (value == -1) {
                    break;
                }

                for (int i = 7; i >= 0 && bitsRead < bitCount; i--) {
                    int bit = (value >> i) & 1;
                    if (bit == 0) {
                        current = current.left;
                    } else {
                        current = current.right;
                    }
                    if (current.isLeaf()) {
                        decoded.write(current.symbol);
                        current = root;
                    }
                    bitsRead++;
                }
            }

            try (FileOutputStream out = new FileOutputStream(outputFile)) {
                decoded.writeTo(out);
            }
        }
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
            return new Node(only.frequency, only,null);
        }

        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();

            Node parent = new Node(left.frequency + right.frequency,left,right);

            queue.add(parent);
        }

        return queue.poll();
    }
}
