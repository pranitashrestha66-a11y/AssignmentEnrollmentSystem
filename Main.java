public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("S2400", "Pranita", "pranita@example.com");
        Student s2 = new Student("S2401", "Bip", "bip@example.com");
        Student s3 = new Student("S2402", "Tip", "tip@example.com");

        Course c1 = new Course("ITS206", "Software Construction", 1);

        if (c1.addStudent(s1)) {
            new Enrollment(s1, c1).displayEnrollmentDetails();
        }

        if (!c1.addStudent(s2)) {
            System.out.println(s2.getName() + " added to waitlist.");
        }

        if (!c1.addStudent(s3)) {
            System.out.println(s3.getName() + " added to waitlist.");
        }

        c1.displayCourseDetails();

        System.out.println("\n--- Removing Student ---");

    }
}