package ua.com.software.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Student brad = new Student("Brad", "Pitt",20,"Geopolitics");
        Student nathalie = new Student("Nathalie", "Portman", 23,"Programming");

        System.out.println("Student: " + brad.getFirstname() + " " + brad.getLastName() + "\nAge: " + brad.getAge() + "\nCourse: " + brad.getCourse() + "\n");
        System.out.println("Student: " + nathalie.getFirstname() + " " + nathalie.getLastName() + "\nAge: " + nathalie.getAge() + "\nCourse: " + nathalie.getCourse() + "\n");

        Teacher pavel = new Teacher("Pavel", "Brooks",43,"Informatics");
        Teacher ivan = new Teacher("Ivan", "Makarenko",55,"Electrics");
        pavel.setWage(8);
        pavel.setTotalHours(140);
        ivan.setWage(5);
        ivan.setTotalHours(168);

        System.out.println("Teacher: " + pavel.getFirstname() + " " + pavel.getLastName() + "\nAge: " + pavel.getAge() + "\nDepartment: " + pavel. getDepartment() + "\nSalary: " + pavel.salary() + "$\n");
        System.out.println("Teacher: " + ivan.getFirstname() + " " + ivan.getLastName() + "\nAge: " + ivan.getAge() + "\nDepartment: " + ivan. getDepartment() + "\nSalary: " + ivan.salary() + "$\n");
    }
}
