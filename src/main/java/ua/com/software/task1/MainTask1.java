package ua.com.software.task1;

public class MainTask1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal frog = new Frog();
        Animal mouse = new Mouse();

        cat.setAge(2);
        cat.setName("Murzik");
        cat.setGender("Man");

        dog.setAge(4);
        dog.setName("Tuzik");
        dog.setGender("Woman");

        frog.setAge(1);
        frog.setName("Kvakusha");
        frog.setGender("woman");

        mouse.setAge(3);
        mouse.setName("Mikki");
        mouse.setGender("Man");

        System.out.println("Cat - age: " + cat.getAge() + " name: " + cat.getName() + " gender: " + cat.getGender());
        System.out.println("Dog - age: " + dog.getAge() + " name: " + dog.getName() + " gender: " + dog.getGender());
        System.out.println("Frog - age: " + frog.getAge() + " name: " + frog.getName() + " gender: " + frog.getGender());
        System.out.println("Mouse - age: " + mouse.getAge() + " name: " + mouse.getName() + " gender: " + mouse.getGender());

        cat.makeSound();
        dog.makeSound();
        frog.makeSound();
        mouse.makeSound();

        cat.eat("Wiskas");
        dog.eat("Pedigree");
        frog.eat("bugs");
        mouse.eat("cheese");
    }
}
