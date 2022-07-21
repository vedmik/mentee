package ua.com.software.work1.taskBonus.accounts;

import ua.com.software.work1.taskBonus.customers.Customer;

public class Loan extends Account {
    public Loan(double balance, int interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }

    @Override
    public float calculateInterest(int month) {
        if(getCustomer().getNumberOfMonthsWithoutInterestRate() <= month){
            return 0;
        } else {
            return super.calculateInterest(month - getCustomer().getNumberOfMonthsWithoutInterestRate());
        }
    }
}
