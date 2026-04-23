import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public boolean addStudent(Student s) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(s);
            return true;
        } else {
            return false;
        }
    }

    public void displayCourseDetails() {
        System.out.println(courseCode + " - " + courseName + " | Capacity: " +
                enrolledStudents.size() + "/" + maxCapacity);
    }
}
