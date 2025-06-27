class TaskNode {
    Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManager {
    private TaskNode head;

    // Add task at the end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search task by ID
    public Task searchTask(int id) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and display all tasks
    public void displayTasks() {
        TaskNode current = head;
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) return;

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task " + id + " deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.taskId == id) {
                current.next = current.next.next;
                System.out.println("Task " + id + " deleted.");
                return;
            }
            current = current.next;
        }

        System.out.println("Task not found.");
    }
}
