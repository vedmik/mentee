package ua.com.software.task1;

public class Dog extends Animal{
    public Dog(int age, String name, Gender gender) {
        super(age, name, gender);
        setSound("Woof!");
    }
}
