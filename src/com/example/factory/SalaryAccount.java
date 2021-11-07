package com.example.factory;

public class SalaryAccount implements BankAccount {
    @Override
    public void openAccount() {
        System.out.println("Opening new salary account");
    }
}