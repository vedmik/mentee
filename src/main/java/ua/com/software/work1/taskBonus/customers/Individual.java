package ua.com.software.work1.taskBonus.customers;

public class Individual extends Customer {
    public Individual(String name) {
        super(name);
        setActivity(TypeOfActivity.INDIVIDUAL);
    }
}
