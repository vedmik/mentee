package ua.com.software.task2;

public class Student extends People{
    private String course;

    public Student(String firstname, String lastName, int age, String course) {
        super(firstname, lastName, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
