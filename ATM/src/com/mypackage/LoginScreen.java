package com.mypackage;

import java.util.List;
import java.util.Scanner;

public class LoginScreen {

    private static Customer customer1 = new Customer("Henry", 123, 123, 0.0, 0.0);
    private Scanner scanner = new Scanner(System.in);
    private List<Integer> customer = CustomerDatabase.customerDatabase().stream().map(Customer::getAccountNumber).toList();
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
            case 1 -> new AccountTypes().checkingAccount();
            case 2 -> new AccountTypes().savingsAccount();
            case 3 -> System.out.println("Goodbye");
        }
        return true;
    }
}

