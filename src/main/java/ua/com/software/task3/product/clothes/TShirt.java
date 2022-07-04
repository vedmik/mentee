package ua.com.software.task3.product.clothes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@Data
@NoArgsConstructor
@SuperBuilder
public class TShirt extends Clothes {
    private String gateOption;
    private int length;
    private int sleeveLength;
    private String print;

    public void show(){
        super.show();
        System.out.println("Gate option: " + gateOption);
        System.out.println("T-Shirt length: " + length + "cm");
        System.out.println("Sleeve length: " + sleeveLength + "cm");
        System.out.println("Print: " + print);
    }
}
