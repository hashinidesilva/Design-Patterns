package com.example.factory;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
/*        BankAccount bankAccount;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter\n 1 for Checking account\n 2 for Salary account\n 3 for Savings account\n" +
                "........................\n");
        String accountType = userInput.nextLine();

        if (accountType.equals("1")) {
            bankAccount = new CheckingAccount();
        } else if (accountType.equals("2")) {
            bankAccount = new SalaryAccount();
        } else if (accountType.equals("3")) {
            bankAccount = new SavingsAccount();
        } else {
            bankAccount = null;
        }

        bankAccount.openAccount();*/

        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        Scanner userInput = new Scanner(System.in);
        System.out.println(" Welcome to ABC Bank.\n Please enter\n 1 for Checking account\n 2 for Salary account\n " +
                "3 for Savings account\n ........................\n");
        String accountType = userInput.nextLine();

        BankAccount bankAccount = bankAccountFactory.createAccount(accountType);
        bankAccount.openAccount();
    }
}