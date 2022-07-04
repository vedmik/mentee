package ua.com.software.task3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class SmartPhone extends Electronics {
    private int batteryVolume;

    public void show(){
        super.show();
        System.out.println("Battery volume: " + batteryVolume + "mA/h");
    }
}
