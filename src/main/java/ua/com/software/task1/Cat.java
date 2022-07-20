package ua.com.software.task1;

public class Cat extends Animal{
    public Cat(int age, String name, Gender gender) {
        super(age, name, gender);
        setSound("Meow!");
    }
}
