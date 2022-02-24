package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int accountNumber;
    private int accountPinNumber;

    public Customer() {
    }

    public Customer(String name, int accountNumber, int accountPinNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountPinNumber = accountPinNumber;
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


}
