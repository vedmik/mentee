package ua.com.software.work1.taskBonus.accounts;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.com.software.work1.taskBonus.customers.Customer;

@Data
@NoArgsConstructor
public abstract class Account {
    private double balance;
    private float interestRate;
    private Customer customer;

    public Account(double balance, int interestRate, Customer customer) {
        setBalance(balance);
        setInterestRate(interestRate);
        setCustomer(customer);
    }

    public float calculateInterest(int month){
        return interestRate * month;
    }

    public double depositMoney(double quantity){
        setBalance(getBalance() + quantity);
        return getBalance();
    }
}
