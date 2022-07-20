package ua.com.software.work1.task3.products.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;

@Data
@NoArgsConstructor
@SuperBuilder
public class Laptop extends ElectronicsBase {

    private boolean sensorDisplay;
    private String keyboardLanguage;
    private int batteryVolume;


    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Sensor display: " + sensorDisplay,
                        "Keyboard language: " + keyboardLanguage,
                        "Battery volume: " + batteryVolume + "mA/h"
                }));
    }
}
