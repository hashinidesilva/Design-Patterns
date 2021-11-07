package com.example.facade;

public class FundsCheck {

    private double balance = 1000.00;

    public double getBalance() {
        return balance;
    }

    public void decreaseCashInAccount(double cash) {
        balance -= cash;
    }

    public void increaseCashInAccount(double cash) {
        balance += cash;
    }

    public boolean haveEnoughMoney(double cash) {
        if (cash > getBalance()) {
            System.out.println("No enough money");
            return false;
        } else {
            decreaseCashInAccount(cash);
            System.out.println("Withdraw money = " + cash + " Balance = " + getBalance());
            return true;
        }
    }

    public void depositCash(double cash) {
        increaseCashInAccount(cash);
        System.out.println("Balance now  = " + getBalance());
    }
}
