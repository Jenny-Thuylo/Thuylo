package com.global.Lesson6;

public class SavingsAccount extends BankAccount implements ITransaction{

    // constructor
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Implementing the withdraw method with custom rules
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Implementing deposit method from Transaction interface
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
    }

    // Overloaded deposit method with currency parameter
    public void deposit(double amount, String currency) {
        double conversionRate = 1.0;
        if (currency.equalsIgnoreCase("EUR")) {
            conversionRate = 1.1; // Simplified currency conversion rate
        } else if (currency.equalsIgnoreCase("GBP")) {
            conversionRate = 1.3;
        }
        double convertedAmount = amount * conversionRate;
        balance += convertedAmount;
        System.out.println("Deposited: " + amount + " " + currency + " (Converted to $" + convertedAmount + "). New balance: $" + balance);
    }
}
