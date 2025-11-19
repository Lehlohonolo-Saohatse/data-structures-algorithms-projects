public class QueueSorter {

    public static QueueAsMyLinkedList<Integer> method (QueueAsMyLinkedList<Integer> pl, int x) {
        if (x == 0) {

            return pl;
        }

        Integer temp = pl.dequeue();

        QueueAsMyLinkedList<Integer> sortedQueue = method(pl, x - 1);

        sortedQueue = insertInSortedOrder(sortedQueue, temp);


        return sortedQueue;
    }


    private static QueueAsMyLinkedList<Integer> insertInSortedOrder(QueueAsMyLinkedList<Integer> queue, Integer element) {
        QueueAsMyLinkedList<Integer> tempQueue = new QueueAsMyLinkedList<>();

        while (!queue.theQueue.isEmpty() && queue.theQueue.getFirst().compareTo(element) < 0) {

            tempQueue.enqueue(queue.dequeue());
        }
        tempQueue.enqueue(element);
        while (!queue.theQueue.isEmpty()) {

            tempQueue.enqueue(queue.dequeue());
        }



        return tempQueue;
    }
}
