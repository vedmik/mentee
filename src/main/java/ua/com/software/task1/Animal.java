package ua.com.software.task1;

import lombok.Data;
import ua.com.software.log.Log;

@Data
public abstract class Animal {
    private int age;
    private String name;
    private Gender gender;
    private String sound;

    public Animal(int age, String name, Gender gender) {
        setAge(age);
        setName(name);
        setGender(gender);
    }

    public void makeSound(){
        Log.saveLog(String.format("%s %s say: %s",
                this.getClass().getSimpleName(), this.getName(), this.getSound()));
    }

    public void eat(String food){
        Log.saveLog(String.format("%s %s eat: %s",
                this.getClass().getSimpleName(), this.getName(), food));
    }

    public String toString(){
        return String.format("%s name: %s, age: %s, gender: %s",
                this.getClass().getSimpleName(), this.getName(), this.getAge(), this.getGender().getGender());
    }
}
