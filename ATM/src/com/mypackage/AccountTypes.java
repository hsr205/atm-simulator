package com.mypackage;

import java.util.Scanner;

public class AccountTypes {

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
        if( new Customer().getCheckingAccountBalance() == 0.0 ) {
            System.out.println("Checking Account Balance: $" + new Customer().getCheckingAccountBalance() + "\n");
            new LoginScreen().getAccountTypes();
        }
        return new Customer().getCheckingAccountBalance();
    }

    private double checkingAccountDeposit() {
        System.out.print("Amount you want to deposit into Checking Account: ");
        double amountDeposited = scanner.nextDouble();
        System.out.println("New Checking Account balance: $" + amountDeposited + "\n");
        new LoginScreen().getAccountTypes();
        return amountDeposited;
    }

    private double checkingAccountWithdraw() {
        System.out.println("Checking Account Balance: " + checkingAccountBalance());
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amountWithdrawn = scanner.nextDouble();
        if (amountWithdrawn > checkingAccountBalance()) {
            System.out.println("Cannot withdraw " + amountWithdrawn);
            return checkingAccountBalance() - amountWithdrawn;
        }

        return checkingAccountBalance();
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
        if (new Customer().getSavingsAccountBalance() == 0.0) {
            System.out.println("Savings Account Balance: $" + new Customer().getSavingsAccountBalance() + "\n");
            new LoginScreen().getAccountTypes();
        }
        return new Customer().getSavingsAccountBalance();
    }

    private double savingsAccountDeposit() {
        System.out.print("Amount you want to deposit into Savings Account: ");
        double amountDeposited = scanner.nextDouble();
        System.out.println("New Savings Account balance: $" + amountDeposited + "\n");
        new LoginScreen().getAccountTypes();
        return amountDeposited;
    }

    private double savingsAccountWithdraw() {
        System.out.println("Savings Account Balance: " + savingsAccountBalance());
        System.out.println("Amount you want to withdraw from Savings Account: ");
        double amountWithdrawn = scanner.nextDouble();
        if (amountWithdrawn > savingsAccountBalance()) {
            System.out.println("Cannot withdraw " + amountWithdrawn);
            return checkingAccountBalance() - amountWithdrawn;
        }

        return checkingAccountBalance();
    }

}
