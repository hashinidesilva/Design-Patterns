package com.example.facade;

public class BankAccountFacade {

    private int accNumber;
    private int securityCode;

    AccountNumberCheck accChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    WelcomeToBank bankWelcome;

    public int getAccNumber() {
        return accNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public BankAccountFacade(int accNumber, int securityCode) {
        this.accNumber = accNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        accChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }

    public void withdrawCash(double cash) {
        if (accChecker.accountActive(getAccNumber()) && codeChecker.isCodeCorrect(getSecurityCode()) && fundChecker.haveEnoughMoney(cash)) {
            System.out.println("Transaction complete");
        } else {
            System.out.println("Transaction failed");
        }
    }

    public void depositCash(double cash) {
        if (accChecker.accountActive(getAccNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {
            fundChecker.depositCash(cash);
            System.out.println("Transaction complete");
        } else {
            System.out.println("Transaction failed");
        }
    }

}

