package ua.com.software.work1.taskBonus.accounts;

import ua.com.software.work1.taskBonus.customers.Customer;
import ua.com.software.work1.taskBonus.customers.TypeOfActivity;

public class Mortgage extends Account {
    private final int individualFreeMonth = 6;
    private final int companyHalfPercentMonth = 12;

    public Mortgage(double balance, float interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }

    @Override
    public float calculateInterest(int month) {
        if(getCustomer().getActivity() == TypeOfActivity.INDIVIDUAL){
            if(month > individualFreeMonth){
                return super.calculateInterest(month - individualFreeMonth);
            } else {
                return 0;
            }
        }

        if(getCustomer().getActivity() == TypeOfActivity.COMPANY){
            if(month > companyHalfPercentMonth){
                return (getInterestRate() / 2) * companyHalfPercentMonth + getInterestRate() * (month - companyHalfPercentMonth);
            } else{
                return (getInterestRate() / 2) * month;
            }
        }
        return super.calculateInterest(month);
    }
}
