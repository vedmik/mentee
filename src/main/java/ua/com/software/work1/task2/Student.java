package ua.com.software.work1.task2;

import lombok.Data;

@Data
public class Student extends People {
    private String course;

    public Student(String firstname, String lastName, int age, String course) {
        super(firstname, lastName, age);
        this.setCourse(course);
    }

    @Override
    public String toString() {
        return String.join("\n", new String[]
                {
                   super.toString(),
                   "Course: " + this.getCourse()
                });
    }
}

