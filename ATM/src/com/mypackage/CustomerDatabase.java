package com.mypackage;

import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {

    public static List<Customer> customerDatabase() {
        return Arrays.asList(new Customer("Henry", 123, 123),
                             new Customer("John", 456, 456),
                             new Customer("Jane", 789, 789),
                             new Customer("Mary", 987, 987),
                             new Customer("Dan", 654, 654));
    }
}
