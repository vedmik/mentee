package ua.com.software.work1.taskBonus.accounts;

import ua.com.software.work1.taskBonus.customers.Customer;

public class Deposit extends Account {

    private final double balanceWithoutInterestRate = 1000.00D;

    public Deposit(double balance, int interestRate, Customer customer) {
        super();
        setInterestRate(interestRate);
        setBalance(balance);
        setCustomer(customer);
    }

    public double withdrawMoney(double quantity){
            setBalance(getBalance() - quantity);
            return getBalance();
    }

    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
        if(getInterestRate() != 0 && getBalance() < balanceWithoutInterestRate){
            setInterestRate(0);
        }
    }
}

