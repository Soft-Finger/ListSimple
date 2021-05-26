public class Node {
    private Object value;
    private Node next;

    public Node(Object value, Node next) throws IllegalArgumentException {
        if (value == null) {
            throw new IllegalArgumentException("Impossible d'ajouter null");
        } else {
            this.value = value;
            this.next = next;
        }
    }

    public Object getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) throws IllegalArgumentException {
        this.next = next;
    }

    public String toString() {
        return null;
    }
}
