package ua.com.software.task1;

import ua.com.software.log.Log;

import java.util.ArrayList;
import java.util.List;

public class MainTask1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Animal cat = new Cat(2,"Murzik",Gender.MAN);
        Animal dog = new Dog(4,"Tuzik",Gender.WOMAN);
        Animal frog = new Frog(1,"Kvakusha",Gender.WOMAN);
        Animal mouse = new Mouse(3,"Mikki",Gender.MAN);

        animals.add(cat);
        animals.add(dog);
        animals.add(frog);
        animals.add(mouse);

        animals.forEach(s -> Log.saveLog(s.toString()));
        System.out.println();

        animals.forEach(Animal::makeSound);
        System.out.println();

        cat.eat("Wiskas");
        dog.eat("Pedigree");
        frog.eat("bugs");
        mouse.eat("cheese");
    }
}
