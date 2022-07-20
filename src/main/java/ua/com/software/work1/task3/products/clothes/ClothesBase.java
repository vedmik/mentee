package ua.com.software.work1.task3.products.clothes;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;
import ua.com.software.work1.task3.products.ProductsBase;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class ClothesBase extends ProductsBase {
    private int size;
    private String color;
    private String material;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Size: " + size,
                        "Color: " + color,
                        "Material: " + material
                }));
    }
}
