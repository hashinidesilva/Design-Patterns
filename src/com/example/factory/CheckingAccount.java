package com.example.factory;

public class CheckingAccount implements BankAccount {

    @Override
    public void openAccount() {
        System.out.println("Opening new checking account");
    }
}