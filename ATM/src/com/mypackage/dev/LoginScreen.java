package com.mypackage.dev;

import java.util.Scanner;

public class LoginScreen {

    private static Customer customer1 = new Customer("Henry", 123, 123, 100.0, 100.0);
    private Scanner scanner = new Scanner(System.in);
//    private List<Integer> customer = CustomerDatabase.customerDatabase().stream().map(Customer::getAccountNumber).toList();
    private int totalAttemptsAccountNumber = 3;
    private int totalAttemptsPinNumber = 3;

    public void getLogin() {
        if (accountNumberLogin() && pinNumberLogin()) {
            getAccountTypes();
        }
    }

    private boolean accountNumberLogin() {
        System.out.println("Welcome to the ATM Project!");
        System.out.print("Enter Your Customer Number: ");
        int customerNumber = scanner.nextInt();
        while (customer1.getAccountNumber() != customerNumber && totalAttemptsAccountNumber != 1) {
            System.out.println("Not A Valid Account Number");
            System.out.print("Enter Your Customer Number: ");
            int customerNum = scanner.nextInt();
            if (customer1.getAccountNumber() == customerNum) {
                break;
            }
            totalAttemptsAccountNumber--;
            if (totalAttemptsAccountNumber == 1) {
                System.out.println("Maximum Attempts Exceeded");
                return false;
            }
        }
        return true;
    }

    private boolean pinNumberLogin() {
        System.out.print("Enter Your Pin Number: ");
        int customerPinNumber = scanner.nextInt();
        while (customer1.getAccountPinNumber() != customerPinNumber && totalAttemptsPinNumber != 1) {
            System.out.println("Incorrect Pin Number");
            System.out.print("Enter Your Pin Number: ");
            int customerPinNum = scanner.nextInt();
            if (customer1.getAccountPinNumber() == customerPinNum) {
                break;
            }
            totalAttemptsPinNumber--;
            if (totalAttemptsPinNumber == 1) {
                System.out.println("Maximum Attempts Exceeded");
                return false;
            }
        }
        return true;
    }

    public boolean getAccountTypes() {
        System.out.println("Select the Account you want to access:");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Savings Account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice: ");
        int accountType = scanner.nextInt();
        switch (accountType) {
            case 1 -> checkingAccount();
            case 2 -> savingsAccount();
            case 3 -> System.out.println("Goodbye");
        }
        return true;
    }

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
        if( customer1.getCheckingAccountBalance() >= 0.0) {
            System.out.println("Checking Account Balance: $" + customer1.getCheckingAccountBalance() + "\n");
            new LoginScreen().getAccountTypes();
        }
        return customer1.getCheckingAccountBalance();
    }

    private double checkingAccountDeposit() {
        System.out.print("Amount you want to deposit into Checking Account: ");
        double amountDeposited = scanner.nextDouble();
        double newAccountBalance = customer1.getCheckingAccountBalance() + amountDeposited;
        System.out.println("New Checking Account balance: $" + newAccountBalance + "\n");
        new LoginScreen().getAccountTypes();
        return newAccountBalance;
    }

    private double checkingAccountWithdraw() {
        System.out.println("Checking Account Balance: $" + customer1.getCheckingAccountBalance());
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amountWithdrawn = scanner.nextDouble();
        if (amountWithdrawn >= customer1.getCheckingAccountBalance()) {
            System.out.println("Cannot withdraw $" + amountWithdrawn);
            return customer1.getCheckingAccountBalance();
        }

        System.out.println("Cash remaining in Checking Account: $" + (customer1.getCheckingAccountBalance() - amountWithdrawn) + "\n");
        new LoginScreen().getAccountTypes();
        return customer1.getCheckingAccountBalance() - amountWithdrawn;
    }


    public boolean savingsAccount() {
        System.out.println("Savings Account:");
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
        if (customer1.getSavingsAccountBalance() >= 0.0) {
            System.out.println("Savings Account Balance: $" + customer1.getSavingsAccountBalance() + "\n");
            new LoginScreen().getAccountTypes();
        }
        return customer1.getSavingsAccountBalance();
    }

    private double savingsAccountDeposit() {
        System.out.print("Amount you want to deposit into Savings Account: ");
        double amountDeposited = scanner.nextDouble();
        double newAccountBalance = customer1.getSavingsAccountBalance() + amountDeposited;
        System.out.println("New Savings Account balance: $" + newAccountBalance + "\n");
        new LoginScreen().getAccountTypes();
        return newAccountBalance;
    }

    private double savingsAccountWithdraw() {
        System.out.println("Savings Account Balance: " + customer1.getSavingsAccountBalance());
        System.out.print("Amount you want to withdraw from Savings Account: ");
        double amountWithdrawn = scanner.nextDouble();
        if (amountWithdrawn >= customer1.getSavingsAccountBalance()) {
            System.out.println("Cannot withdraw $" + amountWithdrawn);
            return customer1.getSavingsAccountBalance() - amountWithdrawn;
        }

        System.out.println("Cash remaining in Savings Account: $" + (customer1.getSavingsAccountBalance() - amountWithdrawn) + "\n");
        new LoginScreen().getAccountTypes();
        return customer1.getSavingsAccountBalance() - amountWithdrawn;
    }
}

