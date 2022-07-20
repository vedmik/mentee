package ua.com.software.task2;


import ua.com.software.log.Log;

import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {
        List<People> peoples = new ArrayList<>();
        peoples.add(new Student("Brad", "Pitt",20,"Geopolitics"));
        peoples.add(new Student("Nathalie", "Portman", 23,"Programming"));

        Teacher teacher1 = new Teacher("Pavel", "Brooks",43,"Informatics");
        Teacher teacher2 = new Teacher("Ivan", "Makarenko",55,"Electrics");
        teacher1.setWage(8);
        teacher1.setTotalHours(140);
        teacher2.setWage(5);
        teacher2.setTotalHours(168);

        peoples.add(teacher1);
        peoples.add(teacher2);

        peoples.forEach(s -> Log.saveLog(s.toString() + "\n"));
    }
}
