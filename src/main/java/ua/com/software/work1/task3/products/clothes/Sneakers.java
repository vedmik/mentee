package ua.com.software.work1.task3.products.clothes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;

@Data
@NoArgsConstructor
@SuperBuilder
public class Sneakers extends ClothesBase {
    private String model;
    private String typeOfLacing;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Model: " + model,
                        "Type of lacing: " + typeOfLacing
                }));
    }
}
