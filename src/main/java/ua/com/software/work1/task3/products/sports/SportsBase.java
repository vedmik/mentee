package ua.com.software.work1.task3.products.sports;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.log.Log;
import ua.com.software.work1.task3.products.ProductsBase;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class SportsBase extends ProductsBase {
    private String kindOfSport;

    public void show(){
        super.show();
        Log.saveLog(String.join("\n", new String[]
                {
                        "Kind of sport: " + kindOfSport
                }));
    }
}
