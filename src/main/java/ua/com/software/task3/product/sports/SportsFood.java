package ua.com.software.task3.product.sports;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class SportsFood extends Sports {
    private int caloricСontent;
    private String timeOfEating;

    public void show(){
        super.show();
        System.out.println("Caloric content: " + caloricСontent);
        System.out.println("Time of eating: " +timeOfEating);
    }

}
