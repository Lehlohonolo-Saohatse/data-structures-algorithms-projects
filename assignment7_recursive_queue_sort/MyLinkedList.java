public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void append(E element) {
        head = appendRecursive(head, element);
        size++;
    }

    private Node<E> appendRecursive(Node<E> current, E element) {
        if (current == null) {
            return new Node<>(element);
        }
        current.next = appendRecursive(current.next, element);
        return current;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return getRecursive(head, index);
    }

    private E getRecursive(Node<E> current, int index) {
        if (index == 0) {
            return current.data;
        }
        return getRecursive(current.next, index - 1);
    }

    // Recursive method to delete the first occurrence of an element
    public boolean delete(E element) {
        boolean[] result = new boolean[1]; // Use array to capture boolean value
        head = deleteRecursive(head, element, result);
        if (result[0]) {
            size--;
        }
        return result[0];
    }

    private Node<E> deleteRecursive(Node<E> current, E element, boolean[] result) {
        if (current == null) {
            return null;
        }
        if (current.data.equals(element)) {
            result[0] = true;
            return current.next;
        }
        current.next = deleteRecursive(current.next, element, result);
        return current;
    }

    public E getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringRecursive(head, sb);
        return sb.toString();
    }

    private void toStringRecursive(Node<E> current, StringBuilder sb) {
        if (current == null) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(current.data);
        toStringRecursive(current.next, sb);
    }
}
