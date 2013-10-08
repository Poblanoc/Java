package com.mybank.test;


import com.mybank.domain.Account;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author infotec162
 */
public class TestAccount {
    public static void main(String[] args) {
        Account acct = new Account(100.0);
        acct.deposit(47.0);
        acct.withdraw(150.0);
        System.out.println("Final account balance is " + acct.getBalance());
    }
}
