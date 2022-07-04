package ua.com.software.task1;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Cat say - Meow!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Cat Eat " + food);
    }
}
