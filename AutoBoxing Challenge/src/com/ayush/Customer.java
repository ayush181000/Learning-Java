package com.ayush;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction = new ArrayList<Double>();

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void addTransaction(double amount) {
        this.transaction.add(amount);
    }

}
