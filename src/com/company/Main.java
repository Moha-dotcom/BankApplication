package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("Wellsfargo");

        bank.addBranches("WellsFargo");
        bank.addBranches("ChaseBank");
        bank.addingCustomer("Mohamed", "WellsFargo",12302.90);
        bank.addingTransactionExistingCustomer("WellsFargo", "Mohamed", 5.4);
        bank.listCustomer("WellsFargo",true);
        System.out.println("-------------------------------------------------------------------------------");

        bank.addingCustomer("Ahmed", "ChaseBank", 8393.38);
        bank.addingTransactionExistingCustomer("ChaseBank", "Ahmed", 902);
        bank.addingTransactionExistingCustomer("ChaseBank", "Ahmed", 12);
        bank.addingTransactionExistingCustomer("ChaseBank", "Ahmed", 34);
        bank.addingTransactionExistingCustomer("ChaseBank", "Ahmed", 90);
        bank.listCustomer("ChaseBank",true);





    }
}
