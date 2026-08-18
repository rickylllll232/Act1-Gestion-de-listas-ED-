public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        System.out.println("Elemento insertado correctamente en Lista Doble.");
    }

    public boolean search(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void delete(T data) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node<T> current = head;

        while (current != null) {
            if (current.getData().equals(data)) {
                if (head == tail) {
                    head = tail = null;
                } 
                else if (current == head) {
                    head = head.getNext();
                    head.setPrev(null);
                } 
                else if (current == tail) {
                    tail = tail.getPrev();
                    tail.setNext(null);
                } 
                else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }
                System.out.println("Elemento eliminado de la Lista Doble.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Elemento no encontrado.");
    }

    public void display() {
        if (head == null) {
            System.out.println("La lista doble está vacía.");
            return;
        }
        
        System.out.println("Contenido de la lista (DOBLEMENTE ENLAZADA):");
        System.out.println("--- Recorrido hacia adelante (Usando Next) ---");
        Node<T> current = head;
        while (current != null) {
            System.out.println(" -> " + current.getData().toString());
            current = current.getNext();
        }
        
        System.out.println("--- Recorrido hacia atrás (Usando Prev) ---");
        current = tail;
        while (current != null) {
            System.out.println(" <- " + current.getData().toString());
            current = current.getPrev();
        }
        System.out.println();
    }
}