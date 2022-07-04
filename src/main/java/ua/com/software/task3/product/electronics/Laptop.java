package ua.com.software.task3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Laptop extends Electronics {

    private boolean sensorDisplay;
    private String keyboardLanguage;
    private int batteryVolume;


    public void show(){
        super.show();
        System.out.println("Sensor display: " + sensorDisplay);
        System.out.println("Keyboard language: " + keyboardLanguage);
        System.out.println("Battery volume: " + batteryVolume + "mA/h");
    }
}
