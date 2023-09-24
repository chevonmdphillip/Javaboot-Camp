package com.chevonphillip.bank.main;

import com.chevonphillip.bank.BankAccount;

public class Main {

    public static void main(String[] args) {
        var account = new BankAccount(1234, "David", 1000);
        System.out.println(account);
        
    }
}
