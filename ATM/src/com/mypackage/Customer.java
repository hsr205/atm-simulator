package com.mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    private Scanner scanner = new Scanner(System.in);

    public boolean checkingAccount() {
        System.out.println("Checking Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        int checkingAccountType = scanner.nextInt();
        switch (checkingAccountType) {
            case 1 -> checkingAccountBalance();
            case 2 -> checkingAccountWithdraw();
            case 3 -> checkingAccountDeposit();
            case 4 -> System.out.println("Exit");
        }
        return true;
    }

    private double checkingAccountBalance() {
        if( this.checkingAccountBalance == 0.0 ) {
            System.out.println("Checking Account Balance: $" + this.checkingAccountBalance + "\n");
            new LoginScreen().getAccountTypes();
        }
        return this.checkingAccountBalance;
    }

    private double checkingAccountDeposit() {
        System.out.print("Amount you want to deposit into Checking Account: ");
        double amountDeposited = scanner.nextDouble();
        double newAccountBalance = this.checkingAccountBalance + amountDeposited;
        System.out.println("New Checking Account balance: $" + newAccountBalance + "\n");
        new LoginScreen().getAccountTypes();
        return newAccountBalance;
    }

    private double checkingAccountWithdraw() {
        System.out.println("Checking Account Balance: " + this.checkingAccountBalance);
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amountWithdrawn = scanner.nextDouble();
        if (amountWithdrawn > this.checkingAccountBalance) {
            System.out.println("Cannot withdraw " + amountWithdrawn);
            return this.checkingAccountBalance;
        }

        return this.checkingAccountBalance - amountWithdrawn;
    }



    public boolean savingsAccount() {
        System.out.println("Checking Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice: ");
        int checkingAccountType = scanner.nextInt();
        switch (checkingAccountType) {
            case 1 -> savingsAccountBalance();
            case 2 -> savingsAccountWithdraw();
            case 3 -> savingsAccountDeposit();
            case 4 -> System.out.println("Exit");
        }
        return true;
    }

    private double savingsAccountBalance() {
        if (this.savingsAccountBalance == 0.0) {
            System.out.println("Savings Account Balance: $" + this.savingsAccountBalance + "\n");
            new LoginScreen().getAccountTypes();
        }
        return this.savingsAccountBalance;
    }

    private double savingsAccountDeposit() {
        System.out.print("Amount you want to deposit into Savings Account: ");
        double amountDeposited = scanner.nextDouble();
        double newAccountBalance = this.savingsAccountBalance + amountDeposited;
        System.out.println("New Savings Account balance: $" + newAccountBalance + "\n");
        new LoginScreen().getAccountTypes();
        return newAccountBalance;
    }

    private double savingsAccountWithdraw() {
        System.out.println("Savings Account Balance: " + this.savingsAccountBalance);
        System.out.println("Amount you want to withdraw from Savings Account: ");
        double amountWithdrawn = scanner.nextDouble();
        if (amountWithdrawn > savingsAccountBalance()) {
            System.out.println("Cannot withdraw " + amountWithdrawn);
            return this.savingsAccountBalance;
        }

        return this.savingsAccountBalance - amountWithdrawn;
    }


}
