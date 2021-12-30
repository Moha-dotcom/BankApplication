package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Customers {

    private String CustomerName;
    private ArrayList<Double> transactions;

    public Customers(String CustomerName, double initialTransaction) {
        this.CustomerName = CustomerName;
        this.transactions = new ArrayList<>();
        addTransactions(initialTransaction);
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);

    }


    public String getCustomerName() {
        return CustomerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
