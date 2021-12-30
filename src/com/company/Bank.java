package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {

    private String BankName;
    private ArrayList<Branches> branches;

    public Bank(String bankName) {
        BankName = bankName;
        this.branches = new ArrayList<>();
    }


    public boolean addBranches(String name){
        if(findBranch(name) == null){
            branches.add(new Branches(name));
            return true;
        }

        return false;
    }

    public Branches findBranch(String branchName){
        for(int i=0; i<branches.size(); i++){
            Branches branch = branches.get(i);
            if(branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public void addingCustomer(String customerName, String branchName, double initialAmount) {
        Branches branch = findBranch(branchName);


        if (branch == null) {
            System.out.println("Branch doesn't Exist : Creating new Branch");
            addBranches(branchName);
            System.out.println("Adding Customer and Initial Deposit");
            branch.newCustomer(customerName, initialAmount);

        } else {
            System.out.println("Adding Customer and Initial Deposit");
            branch.newCustomer(customerName, initialAmount);
        }
    }


    public boolean addingTransactionExistingCustomer(String branchname, String customerName, double amount){
        System.out.println("Depositing for an Existing Customer");
        // We find if this Customer Exists in this branch
        Branches branch = findBranch(branchname);

       if(branch != null){
           return branch.AddingCustomerTransaction(customerName, amount);


       }


        return false;
    }



    public String listCustomer(String branches, boolean showTrans){
        Branches branch   = findBranch(branches);

       if(branch != null){

           ArrayList<Customers> branchCustomer = branch.getCustomers();

            for(int i =0; i< branchCustomer.size(); i++){
                Customers customers = branchCustomer.get(i);
                System.out.println("Customer Name : " + customers.getCustomerName() +  "[" + (i+1) + "]");
                if(showTrans){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = customers.getTransactions();

                    for(int j = 0;  j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount : " +  "$ " + transactions.get(j) );
                    }
                }
            }
       }

        return null;
    }
}
