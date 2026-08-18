public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private String type; 

    public LinkedList(String type) {
        this.type = type;
        this.head = null;
        this.tail = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            if (type.equals("CIRCULAR")) {
                tail.setNext(head);
            }
        } else {
            tail.setNext(newNode);
            tail = newNode;
            if (type.equals("CIRCULAR")) {
                tail.setNext(head);
            }
        }
        System.out.println("Elemento insertado correctamente.");
    }

    public boolean search(T data) {
        if (head == null) return false;
        Node<T> current = head;
        do {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        } while (current != null && current != head);
        return false;
    }

    public void delete(T data) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;

        do {
            if (current.getData().equals(data)) {
                if (head == tail && head == current) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.getNext();
                    if (type.equals("CIRCULAR")) tail.setNext(head);
                } else if (current == tail) {
                    tail = previous;
                    tail.setNext(type.equals("CIRCULAR") ? head : null);
                } else {
                    previous.setNext(current.getNext());
                }
                System.out.println("Elemento eliminado.");
                return;
            }
            previous = current;
            current = current.getNext();
        } while (current != null && current != head);

        System.out.println("Elemento no encontrado.");
    }

    public void display() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node<T> current = head;
        System.out.print("Contenido de la lista (" + type + "): \n");
        do {
            System.out.println(" -> " + current.getData().toString());
            current = current.getNext();
        } while (current != null && current != head);
        System.out.println();
    }
}