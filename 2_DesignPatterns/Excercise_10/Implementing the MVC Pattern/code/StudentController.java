//StudentController.java – Controller

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Setters through controller
    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentId(String id) {
        model.setId(id);
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Getters through controller
    public String getStudentName() { return model.getName(); }
    public String getStudentId() { return model.getId(); }
    public String getStudentGrade() { return model.getGrade(); }

    // Display method
    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
