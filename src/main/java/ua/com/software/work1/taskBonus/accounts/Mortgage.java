package ua.com.software.work1.taskBonus.accounts;

import ua.com.software.work1.taskBonus.customers.Customer;

public class Mortgage extends Account {
    public Mortgage(double balance, int interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }
}
