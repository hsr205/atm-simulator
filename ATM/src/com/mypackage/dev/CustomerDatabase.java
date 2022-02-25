package com.mypackage.dev;

import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {

    public CustomerDatabase() {
    }

    public static List<Customer> customerDatabase() {
        return Arrays.asList(new Customer("Henry", 123, 123,0.0,0.0),
                             new Customer("John", 456, 456,0.0,0.0),
                             new Customer("Jane", 789, 789,0.0,0.0),
                             new Customer("Mary", 987, 987,0.0,0.0),
                             new Customer("Dan", 654, 654,0.0,0.0));
    }
}
