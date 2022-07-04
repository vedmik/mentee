package ua.com.software.task3.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class Product {
    private int productCode;
    private String brand;
    private float price = 1.00f;
    private float grossWeight;
    private float packageHeight;
    private float packageLength;
    private float packageWidth;

    public void show(){
        System.out.println("Product Code: " + this.productCode);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price + "$");
        System.out.println("Gross weight: " + this.grossWeight + "kg");
        System.out.println("Package height: " + this.packageHeight + "сm");
        System.out.println("Package length: " + this.packageLength + "сm");
        System.out.println("Package width: " + this.packageWidth + "сm");
    }
}
