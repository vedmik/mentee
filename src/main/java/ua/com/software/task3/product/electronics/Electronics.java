package ua.com.software.task3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.task3.product.Product;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class Electronics extends Product {
    private String powerSupply;
    private int voltage;
    private String operationSystem;
    private String processor;
    private float displayDiagonal;
    private Integer screenRefreshRate;
    private String model;

    public void show(){
        super.show();
        System.out.println("Model: " + model);
        System.out.println("Power supply: " + powerSupply);
        System.out.println("Voltage: " + voltage +"V");
        System.out.println("Operation system: " + operationSystem);
        System.out.println("Processor: " + processor);
        System.out.println("Display diagonal: " + displayDiagonal + "inch");
        System.out.println("Screen refresh rate: " + screenRefreshRate + "Hz");

    }
}
