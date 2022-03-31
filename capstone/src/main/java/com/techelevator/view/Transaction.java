package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;

public class Transaction{
    private static double balance = 0.00;


//    public Transaction(InputStream input, OutputStream output){
//        this.out =



    public static void addToBalance(double feed) {
        balance += feed;
    }

    public static double getBalance() {
        return balance;
    }
}
