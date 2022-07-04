package ua.com.software.task3.product.sports;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class FitnessEquipment extends Sports{
    private String applicationMethod;
    private boolean waterproof;

    public void show(){
        super.show();
        System.out.println("Application method: " + applicationMethod);
        System.out.println("waterproof: " + waterproof);
    }
}
