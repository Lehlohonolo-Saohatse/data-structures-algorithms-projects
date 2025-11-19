public class TestProgram {
    public static void main(String[] args) {
        QueueAsMyLinkedList<Integer> list = new QueueAsMyLinkedList<>();

        System.out.println("Enqueue and Dequeue an initially empty list");
        System.out.println("Dequeue from empty list: " + list.dequeue()); // Expect to return: null
        System.out.println("Is empty: " + list.theQueue.isEmpty()); // Expect to return: true

        System.out.println("------------------------------------------------------------");

        // Enqueue elements
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        System.out.println("List: " + list); // Expect to return: [10, 20, 30]


        System.out.println("------------------------------------------------------------");

        // Dequeue elements
        System.out.println("Dequeue: " + list.dequeue()); // Expect to return: 10
        System.out.println("Queue after one dequeue: " + list); // Expect to return: [20, 30]
        System.out.println("Dequeue: " + list.dequeue()); //Expect to return 20
        System.out.println("Queue after two dequeues: " + list); // Expect to return - [30]
        System.out.println("Dequeue: " + list.dequeue()); // Expect to return: 30
        System.out.println("Is empty after dequeuing all: " + list.theQueue.isEmpty()); // Expect to return: true

        System.out.println("------------------------------------------------------------");

        // Re-enqueue again
        list.enqueue(40);
        list.enqueue(50);
        System.out.println("Queue after re-enqueueing 40 and 50: " + list); // Expect to return: [40, 50]

        System.out.println("------------------------------------------------------------");


        // Test sorting, but enqueue atleast 4 more elements
        list.enqueue(60);
        list.enqueue(30);
        list.enqueue(20);
        list.enqueue(10);
        System.out.println("Queue before sorting: " + list); // Expect to return: [40, 50, 60, 30, 20, 10]

        System.out.println("------------------------------------------------------------");


        // Sort the list {as on the given example}
        QueueAsMyLinkedList<Integer> sortedQueue = QueueSorter.method(list, 6);
        System.out.println("Queue after sorting: " + sortedQueue); // Expect to return: [10, 20, 30, 40, 50, 60]

        System.out.println("------------------------------------------------------------");


        // Clear the list and test if it's empty
        list = new QueueAsMyLinkedList<>();
        System.out.println("Queue after clearing: " + list); // Expect to return: []
        System.out.println("Is empty after clearing: " + list.theQueue.isEmpty()); // Expect to return: true
    }
}
