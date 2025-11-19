public class TaskManagementSystem {
    private QueueAsMyLinkedList<String> taskQueue;
    private StackAsMyLinkedList<String> undoStack;

    public TaskManagementSystem() {
        taskQueue = new QueueAsMyLinkedList<>();
        undoStack = new StackAsMyLinkedList<>();
    }

    public void add(String task) {
        taskQueue.enqueue(task);
        undoStack.push("Added: " + task);
    }

    public String processTheTask() {
        if (taskQueue.isEmpty()) {
            return "No tasks to process";
        }
        String task = taskQueue.dequeue();
        undoStack.push("Processed: " + task);
        return task;
    }

    public String undo() {
        if (undoStack.isEmpty()) {
            return "No actions to undo";
        }
        return undoStack.pop();
    }

    public String viewTheTasks() {
        return "Tasks in queue: " + taskQueue.toString();
    }

    public String viewUndoStack() {
        return "Undo actions: " + undoStack.toString();
    }
}
