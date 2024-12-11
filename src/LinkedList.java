
public class LinkedList<T> {
	private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
