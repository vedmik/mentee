package ua.com.software.work1.task3.products.clothes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;

@Data
@NoArgsConstructor
@SuperBuilder
public class TShirt extends ClothesBase {
    private String gateOption;
    private int length;
    private int sleeveLength;
    private String print;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Gate option: " + gateOption,
                        "T-Shirt length: " + length + "cm",
                        "Sleeve length: " + sleeveLength + "cm",
                        "Print: " + print
                }));
    }
}
