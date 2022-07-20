package ua.com.software.task3.product.sports;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;

@Data
@NoArgsConstructor
@SuperBuilder
public class FitnessEquipment extends SportsBase {
    private String applicationMethod;
    private boolean waterproof;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Application method: " + applicationMethod,
                        "waterproof: " + waterproof
                }));
    }
}
