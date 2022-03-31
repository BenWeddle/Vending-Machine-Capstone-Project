package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;

public class Transaction{
    private double balance = 0.00;


//    public Transaction(InputStream input, OutputStream output){
//        this.out =



    public void addToBalance(int feed) {
        balance += feed;
    }

    public double getBalance() {
        return balance;
    }
}
