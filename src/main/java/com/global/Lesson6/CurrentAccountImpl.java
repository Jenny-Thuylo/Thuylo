package com.global.Lesson6;

class CurrentAccountImpl extends BankAccount implements ITransaction {

    public CurrentAccountImpl(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
    }

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
