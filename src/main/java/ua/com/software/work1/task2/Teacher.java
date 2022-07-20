package ua.com.software.work1.task2;

import lombok.Data;

@Data
public class Teacher extends People {

    private String department;
    private int wage;
    private int totalHours;

    public Teacher(String firstname, String lastName, int age, String department) {
        super(firstname, lastName, age);
        this.setDepartment(department);
    }

    public int getTotalSalary(){
        return getWage() * getTotalHours();
    }

    @Override
    public String toString() {
        return String.join("\n", new String[]
                {
                        super.toString(),
                        "Department: " + this.getDepartment(),
                        "Salary: " + getTotalSalary() + "$"
                });
    }
}
