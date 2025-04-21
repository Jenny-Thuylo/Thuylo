package com.global.Lesson6;

public abstract class BankAccount {

    String accountHolder;
    double balance;

    //constructor
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    abstract void withdraw(double amount); // abstract method
    public void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

}