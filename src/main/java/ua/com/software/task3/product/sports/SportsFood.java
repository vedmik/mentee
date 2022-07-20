package ua.com.software.task3.product.sports;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;

@Data
@NoArgsConstructor
@SuperBuilder
public class SportsFood extends SportsBase {
    private int caloricСontent;
    private String timeOfEating;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Caloric content: " + caloricСontent,
                        "Time of eating: " +timeOfEating
                }));
    }
}
