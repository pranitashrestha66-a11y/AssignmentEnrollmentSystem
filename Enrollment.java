import java.time.LocalDate;

public class Enrolment {
    private Student student;
    private Course course;
    private LocalDate enrolmentDate;

    public Enrolment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrolmentDate = LocalDate.now();
    }

    public void displayEnrolmentDetails() {
        System.out.println("Enrolment: " + student.getName() +
                " -> " + course.getCourseCode() + " on " + enrolmentDate);
    }
}
