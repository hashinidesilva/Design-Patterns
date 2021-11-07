package com.example.factory;

public class BankAccountFactory {

    public BankAccount createAccount(String accountType) {
        if (accountType.equals("1")) {
            return new CheckingAccount();
        } else if (accountType.equals("2")) {
            return new SalaryAccount();
        } else if (accountType.equals("3")) {
            return new SavingsAccount();
        } else {
            return null;
        }
    }

}
