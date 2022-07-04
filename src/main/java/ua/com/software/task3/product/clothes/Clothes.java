package ua.com.software.task3.product.clothes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.task3.product.Product;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class Clothes extends Product {
    private int size;
    private String color;
    private String material;

    public void show(){
        super.show();
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }
}
