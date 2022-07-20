package ua.com.software.task1;

public class Mouse extends Animal{
    public Mouse(int age, String name, Gender gender) {
        super(age, name, gender);
        setSound("Piii!");
    }
}
