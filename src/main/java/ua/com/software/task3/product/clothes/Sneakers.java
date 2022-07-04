package ua.com.software.task3.product.clothes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Sneakers extends Clothes {
    private String model;
    private String typeOfLacing;

    public void show(){
        super.show();
        System.out.println("Model: " + model);
        System.out.println("Type of lacing: " + typeOfLacing);
    }
}
