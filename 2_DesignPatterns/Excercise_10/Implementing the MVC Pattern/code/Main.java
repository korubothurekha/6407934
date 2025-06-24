//Main.java – Test MVC

public class Main {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("Rekha Korubothu", "AU2025001", "A+");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();
        System.out.println();
        System.out.println("Updating Student details");
        // Update student data
        controller.setStudentGrade("O");
        controller.setStudentName("Rekha K.");

        // Display updated data
        controller.updateView();
    }
}
