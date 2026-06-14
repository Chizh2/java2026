public class Node implements Comparable<Node> {
    byte symbol;
    int frequency;
    Node left;
    Node right;

    public Node(byte symbol, int frequency) {
        this.symbol = symbol;
        this.frequency = frequency;
    }

    public Node(int frequency, Node left, Node right) {
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.frequency, other.frequency);
    }
}
