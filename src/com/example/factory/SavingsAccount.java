package com.example.factory;

public class SavingsAccount implements BankAccount {
    @Override
    public void openAccount() {
        System.out.println("Opening new business account");
    }
}
