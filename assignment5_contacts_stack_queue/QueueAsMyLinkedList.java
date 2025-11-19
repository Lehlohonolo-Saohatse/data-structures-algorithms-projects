public class QueueAsMyLinkedList<E> {
    MyLinkedList<E> theQueue;

    public QueueAsMyLinkedList() {
        theQueue = new MyLinkedList<>();
    }

    public void enqueue(E newElement) {
        theQueue.append(newElement);
    }

    public E dequeue() {
        E temp = theQueue.getFirst();
        if (temp != null) {
            theQueue.delete(temp);
        }
        return temp;
    }

    public boolean isEmpty() {
        return theQueue.getFirst() == null;
    }

    @Override
    public String toString() {
        return theQueue.toString();
    }
}
