package ua.com.software.work1.taskBonus.accounts;

import ua.com.software.work1.taskBonus.customers.Customer;
import ua.com.software.work1.taskBonus.customers.TypeOfActivity;

public class Loan extends Account {
    private final int individualFreeMonth = 3;
    private final int companyFreeMonth = 2;

    public Loan(double balance, float interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }

    @Override
    public float calculateInterest(int month) {
        if(getCustomer().getActivity() == TypeOfActivity.INDIVIDUAL){
            return month <= individualFreeMonth ? 0 : super.calculateInterest(month - individualFreeMonth);
        }

        if(getCustomer().getActivity() == TypeOfActivity.COMPANY){
            return month <= companyFreeMonth ? 0 : super.calculateInterest(month - companyFreeMonth);
        }
        return super.calculateInterest(month);
    }
}
