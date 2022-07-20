package ua.com.software.task3.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class ProductBase {
    private int productCode;
    private String brand;
    private float price = 1.00f;
    private float grossWeight;
    private float packageHeight;
    private float packageLength;
    private float packageWidth;

    public void show(){
        Log.saveLog(String.join("\n", new String[]
                {
                        "Product Code: " + this.productCode,
                        "Brand: " + this.brand,
                        "Price: " + this.price + "$",
                        "Gross weight: " + this.grossWeight + "kg",
                        "Package height: " + this.packageHeight + "сm",
                        "Package length: " + this.packageLength + "сm",
                        "Package width: " + this.packageWidth + "сm"
                }));
    }
}
