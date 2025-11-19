public class StackAsMyLinkedList<E> {
    MyLinkedList<E> theStack;

    public StackAsMyLinkedList() {
        theStack = new MyLinkedList<>();
    }

    public void push(E newElement) {
        theStack.prepend(newElement);
    }

    public E pop() {
        E temp = theStack.getFirst();
        if (temp != null) {
            theStack.delete(temp);
        }
        return temp;
    }

    public E peek() {
        return theStack.getFirst();
    }

    public boolean isEmpty() {
        return theStack.getFirst() == null;
    }

    @Override
    public String toString() {
        return theStack.toString();
    }
}
