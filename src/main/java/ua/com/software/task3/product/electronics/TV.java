package ua.com.software.task3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@SuperBuilder
public class TV extends Electronics {
    private String maxResolution;

    public void show(){
        super.show();
        System.out.println("Maximal resolution: " + maxResolution);
    }
}
