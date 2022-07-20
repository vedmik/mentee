package ua.com.software.work1.task3.products.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;

@Data
@NoArgsConstructor
@SuperBuilder
public class SmartPhone extends ElectronicsBase {
    private int batteryVolume;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Battery volume: " + batteryVolume + "mA/h"
                }));
    }
}
