package ua.com.software.task1;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog say - Woff!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dog eat " + food);
    }
}
