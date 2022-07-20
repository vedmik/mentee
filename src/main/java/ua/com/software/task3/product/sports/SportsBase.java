package ua.com.software.task3.product.sports;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;
import ua.com.software.task3.product.ProductBase;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class SportsBase extends ProductBase {
    private String kindOfSport;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Kind of sport: " + kindOfSport
                }));
    }
}
