public class Student {
    private String studentID;
    private String name;
    private String email;

    public Student(String studentID, String name, String email) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;

    }

    // Getters & Setters
    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", Email: " + email);
    }
}

