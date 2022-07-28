package ua.com.software.work1.taskBonus.accounts;

import ua.com.software.work1.taskBonus.customers.Customer;

public class Deposit extends Account {

    private final double balanceWithoutInterestRate = 1000.00D;

    public Deposit(double balance, float interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }

    public double withdrawMoney(double quantity){
            setBalance(getBalance() - quantity);
            return getBalance();
    }

    @Override
    public float calculateInterest(int month) {
        if(getBalance() < balanceWithoutInterestRate && getBalance() > 0){
            return 0;
        } else {
            return super.calculateInterest(month);
        }
    }
}

