package ua.com.software.task3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;
import ua.com.software.task3.product.ProductBase;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class ElectronicsBase extends ProductBase {
    private String powerSupply;
    private int voltage;
    private String operationSystem;
    private String processor;
    private float displayDiagonal;
    private Integer screenRefreshRate;
    private String model;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Model: " + model,
                        "Power supply: " + powerSupply,
                        "Voltage: " + voltage +"V",
                        "Operation system: " + operationSystem,
                        "Processor: " + processor,
                        "Display diagonal: " + displayDiagonal + "inch",
                        "Screen refresh rate: " + screenRefreshRate + "Hz"
                }));
    }
}
