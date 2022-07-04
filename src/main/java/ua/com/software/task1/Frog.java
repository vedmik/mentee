package ua.com.software.task1;

public class Frog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Frog say - Quaa!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Frog eat " + food);
    }
}
