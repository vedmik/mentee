package ua.com.software.work1.taskBonus.customers;

import lombok.Data;

@Data
public abstract class Customer{

    private String name;
    private String surname;

    private int numberOfMonthsWithoutInterestRateForDeposits;

    private int numberOfMonthsWithoutInterestRateForMortgage;


    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
