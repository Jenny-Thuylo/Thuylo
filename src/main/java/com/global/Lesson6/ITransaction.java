package com.global.Lesson6;

public interface ITransaction {

    void deposit(double amount);
    void deposit(double amount, String currency);
    void withdraw (double amount);
}


