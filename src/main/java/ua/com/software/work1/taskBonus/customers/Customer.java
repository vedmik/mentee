package ua.com.software.work1.taskBonus.customers;

import lombok.Data;

@Data
public abstract class Customer{

    private String name;
    private TypeOfActivity activity;

    public Customer(String name) {
        this.name = name;
    }
}
