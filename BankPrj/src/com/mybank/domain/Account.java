package com.mybank.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author infotec162
 */
public class Account {
    private double balance; 
    public Account(double initBalance) {
        balance = initBalance;
    }    
    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    } 
    public boolean withdraw(double amt) {
        boolean result = false;
        if( amt <= balance ){
        balance = balance - amt;
        result = true;
        }
        return result;
    }
    public double getBalance() {
        return balance;
    }  
}
