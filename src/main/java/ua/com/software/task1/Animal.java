package ua.com.software.task1;

public abstract class Animal {
    private int age;
    private String name;
    private String gender;

    public abstract void makeSound();
    public abstract void eat(String food);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
