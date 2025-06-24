public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Imagify project UI", "Pending"));
        manager.addTask(new Task(2, "Going for sponsorship", "In Progress"));
        manager.addTask(new Task(3, "Gym progress", "Not Started"));

        System.out.println("List of all Tasks:");
        manager.displayTasks();

        System.out.println("\nSearch for Task with ID 2:");
        System.out.println(manager.searchTask(2));

        System.out.println("\nDelete Task with ID 2:");
        manager.deleteTask(2);

        System.out.println("\nAfter Deletion of task with ID 2 , here is the list:");
        manager.displayTasks();
    }
}
