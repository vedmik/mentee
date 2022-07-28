package ua.com.software.work1.taskBonus;

import ua.com.software.log.Log;
import ua.com.software.work1.taskBonus.accounts.Account;
import ua.com.software.work1.taskBonus.accounts.Deposit;
import ua.com.software.work1.taskBonus.accounts.Loan;
import ua.com.software.work1.taskBonus.accounts.Mortgage;
import ua.com.software.work1.taskBonus.customers.Company;
import ua.com.software.work1.taskBonus.customers.Customer;
import ua.com.software.work1.taskBonus.customers.Individual;

public class Main {
    public static void main(String[] args) {
        Customer company = new Company("MKS");
        Customer individual = new Individual("Ivanov Petr");

        Account indDeposit = new Deposit(500, 2.5F, individual);
        Account indLoan = new Loan(0, 3,individual);
        Account indMortgage = new Mortgage(300, 5, individual);

        Account compDeposit = new Deposit(1100, 3, company);
        Account compLoan = new Loan(400, 4, company);
        Account compMortgage = new Mortgage(700,5.5F, company);

        Log.saveLog("Individual deposit calculate interest from 12 month: " + indDeposit.calculateInterest(12) + "%");
        Log.saveLog("Individual loan calculate interest from 12 month: " + indLoan.calculateInterest(12) + "%");
        Log.saveLog("Individual mortgage calculate interest from 12 month: " + indMortgage.calculateInterest(12) + "%");

        Log.saveLog("");

        Log.saveLog("Company deposit calculate interest from 12 month: " + compDeposit.calculateInterest(12) + "%");
        Log.saveLog("Company loan calculate interest from 12 month: " + compLoan.calculateInterest(12) + "%");
        Log.saveLog("Company mortgage calculate interest from 12 month: " + compMortgage.calculateInterest(12) + "%");
    }
}
