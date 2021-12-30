package com.company;

import java.util.ArrayList;

public class Branches {

    private String branchName;
    private ArrayList<Customers> customers;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean newCustomer(String Customername, double initialAmount){
        if(findCustomer(Customername) == null ){
            this.customers.add(new Customers(Customername, initialAmount));
            return true;
        }

        return false;

    }


    public boolean AddingCustomerTransaction(String customerName, double amount){
        Customers customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransactions(amount);
            return true;


        }
        return false;

    }

    private Customers findCustomer(String customername) {
        for(int i =0; i< customers.size(); i++){
            Customers name =  customers.get(i);
            if(name.getCustomerName().equals(customername)){
                return name;
            }
        }

        return null;
    }














}
