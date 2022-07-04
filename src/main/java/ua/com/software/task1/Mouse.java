package ua.com.software.task1;

public class Mouse extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Mouse say - Ppppi!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Mouse eat " + food);
    }
}
