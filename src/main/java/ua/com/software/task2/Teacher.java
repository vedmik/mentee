package ua.com.software.task2;

public class Teacher extends People {

    private String department;
    private int wage;
    private int totalHours;

    public Teacher(String firstname, String lastName, int age, String department) {
        super(firstname, lastName, age);
        this.department = department;
    }

    public int salary(){
        return wage * totalHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }
}
