package com.global.Lesson6;

public class Main {
    public static void main(String[] args) {

    // Creating SavingsAccount and CurrentAccount objects
    BankAccount savingsAccount = new SavingsAccount("Nguyen Van A", 1000);
    BankAccount currentAccount = new CurrentAccountImpl("Nguyen Van B", 2000);

    // Performing transactions on SavingsAccount
    savingsAccount.displayBalance();
    ((ITransaction) savingsAccount).deposit(500); // Depositing $500
    ((ITransaction) savingsAccount).deposit(100, "VND"); // Depositing 100 EUR (converted)
    ((ITransaction) savingsAccount).withdraw(300); // Withdrawing $300

    // Performing transactions on CurrentAccount
    currentAccount.displayBalance();
    ((ITransaction) currentAccount).deposit(200); // Depositing $200
    ((ITransaction) currentAccount).deposit(50, "EUR"); // Depositing 50 GBP (converted)
    ((ITransaction) currentAccount).withdraw(1500); // Withdrawing $1500
}
}
