package com.techelevator.view;

public class Transaction{
    private double balance = 0.00;

    public Transaction(){}

    public void addToBalance(int feed) {
        balance += feed;
    }

    public double getBalance() {
        return balance;
    }
}
