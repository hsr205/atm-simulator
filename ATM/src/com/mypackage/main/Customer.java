package com.mypackage.main;

public class Customer {

    private String name;
    private int accountNumber;
    private int accountPinNumber;
    private double checkingAccountBalance;
    private double savingsAccountBalance;

    public Customer() {
    }

    public Customer(String name, int accountNumber, int accountPinNumber, double checkingAccountBalance, double savingsAccountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountPinNumber = accountPinNumber;
        this.checkingAccountBalance = checkingAccountBalance;
        this.savingsAccountBalance = savingsAccountBalance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountPinNumber() {
        return accountPinNumber;
    }

    public double getCheckingAccountBalance() {
        return checkingAccountBalance;
    }

    public double getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

}
