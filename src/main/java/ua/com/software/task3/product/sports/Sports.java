package ua.com.software.task3.product.sports;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ua.com.software.task3.product.Product;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class Sports extends Product {
    private String kindOfSport;

    public void show(){
        super.show();
        System.out.println("Kind of sport: " + kindOfSport);
    }
}
