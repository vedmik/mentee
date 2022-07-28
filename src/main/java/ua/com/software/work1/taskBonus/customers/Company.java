package ua.com.software.work1.taskBonus.customers;

public class Company extends Customer {
    public Company(String name) {
        super(name);
        setActivity(TypeOfActivity.COMPANY);
    }
}
