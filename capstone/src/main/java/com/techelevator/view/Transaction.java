package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

public class Transaction{
    private static BigDecimal balance = new BigDecimal("0.00");


    public void addToBalance(String feed) {
        if (feed.contains(".")) {
            System.out.println("Please enter a whole dollar amount, no change.\n");
        } else if (feed.matches("\\d+")) {
            balance = balance.add(new BigDecimal(Integer.parseInt(feed)));
        } else {
            System.out.println("Please enter valid number.\n");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void makePurchase(double price){
        if (balance.compareTo(new BigDecimal(price)) > 0) {
            balance = balance.add(new BigDecimal(price));
        } else {
            System.out.println("Insufficient funds.\n");
        }
    }

}
