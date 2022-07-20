package ua.com.software.task2;

import lombok.Data;

@Data
public abstract class People {
    private String firstname;
    private String lastName;
    private int age;

    public People(String firstname, String lastName, int age) {
        setFirstname(firstname);
        setLastName(lastName);
        setAge(age);
    }

    public String toString(){
        return String.join("\n", new String[]
                {
                        "Status: " + this.getClass().getSimpleName(),
                        "Name: " + this.getFirstname() + " " + this.getLastName(),
                        "Age: " + this.getAge()
                });
    }
}
