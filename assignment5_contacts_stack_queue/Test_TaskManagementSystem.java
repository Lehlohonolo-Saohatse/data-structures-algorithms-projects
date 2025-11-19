public class Test_TaskManagementSystem {
    public static void main(String[] args) {
        // Test StackAsMyLinkedList
        System.out.println("Testing StackAsMyLinkedList: ");
        StackAsMyLinkedList<String> stack = new StackAsMyLinkedList<>();

        // Test stack operations
        System.out.println("Push operations: ");
        stack.push("Item1");
        stack.push("Item2");
        stack.push("Item3");
        System.out.println("Stack after pushes: " + stack);

        System.out.println("Peek at top element: " + stack.peek());
        System.out.println("-------------------------------------------");

        System.out.println("Pop operations: ");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Stack after pops: " + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());

        // Test case: peek and pop on empty stack
        System.out.println("Peek on empty stack: " + stack.peek());
        System.out.println("Pop on empty stack: " + stack.pop());

        System.out.println("-------------------------------------------");

        // Test QueueAsMyLinkedList
        System.out.println("Testing QueueAsMyLinkedList: ");
        QueueAsMyLinkedList<String> queue = new QueueAsMyLinkedList<>();

        // Test queue operations
        System.out.println("Enqueue operations: ");
        queue.enqueue("Element1");
        queue.enqueue("Element2");
        queue.enqueue("Element3");
        System.out.println("Queue after enqueues: " + queue); // Expecting: [Element1, Element2, Element3]

        System.out.println("Dequeue operations: ");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Queue after dequeues: " + queue);

        System.out.println("Is queue empty? " + queue.isEmpty());

        // Test case: dequeue on empty queue
        System.out.println("Dequeue on empty queue: " + queue.dequeue());

        System.out.println("-------------------------------------------");

        // Test TaskManagementSystem
        System.out.println("Testing TaskManagementSystem: ");
        TaskManagementSystem the_TMS_System = new TaskManagementSystem();

        // Add tasks
        System.out.println("Adding tasks: ");
        the_TMS_System.add("Task 1");
        the_TMS_System.add("Task 2");
        the_TMS_System.add("Task 3");
        System.out.println("Tasks in queue: " + the_TMS_System.viewTheTasks());

        // Process tasks
        System.out.println("Processing tasks: ");
        System.out.println(the_TMS_System.processTheTask());
        System.out.println(the_TMS_System.processTheTask());
        System.out.println("Tasks in queue: " + the_TMS_System.viewTheTasks());

        // Undo actions
        System.out.println("Undoing actions: ");
        System.out.println(the_TMS_System.undo());
        System.out.println(the_TMS_System.undo());
        System.out.println("Undo stack: " + the_TMS_System.viewUndoStack());

        // Process the remaining tasks and undo
        System.out.println("Processing the remaining tasks: ");
        System.out.println(the_TMS_System.processTheTask());
        System.out.println(the_TMS_System.processTheTask());
        System.out.println("Tasks in queue: " + the_TMS_System.viewTheTasks());

        System.out.println("Undoing remaining actions: ");
        System.out.println(the_TMS_System.undo());
        System.out.println(the_TMS_System.undo());
        System.out.println(the_TMS_System.undo());
        System.out.println(the_TMS_System.undo());
        System.out.println("Undo stack: " + the_TMS_System.viewUndoStack());

        // Test case: trying to undo after all actions have been undone
        System.out.println("Final state of undo stack: " + the_TMS_System.viewUndoStack());
    }
}
