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
            case 1 -> System.out.println("View Balance");
            case 2 -> System.out.println("Withdraw Funds");
            case 3 -> System.out.println("Deposit Funds");
            case 4 -> System.out.println("Exit");
        }
        return true;
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
            case 1 -> System.out.println("View Balance");
            case 2 -> System.out.println("Withdraw Funds");
            case 3 -> System.out.println("Deposit Funds");
            case 4 -> System.out.println("Exit");
        }
        return true;
    }


}
