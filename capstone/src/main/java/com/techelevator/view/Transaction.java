package com.techelevator.view;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Transaction{
    private static BigDecimal balance = new BigDecimal("0.00");

    final double dollar = 1.00;
    final double quarter = .25;
    final double dime = .10;
    final double nickel = .05;
    final double penny = .01;


    public void addToBalance(String feed) {
        if (feed.contains(".")) {
            System.out.println("Please enter a whole dollar amount, no change.\n");
        } else if (feed.matches("\\d+")) {
            balance = balance.add(new BigDecimal(Integer.parseInt(feed)));
        } else {
            System.out.println("Please enter valid number.\n");
        }
    }
    
//    public void addToBalance(String feed) {
//        if (feed.contains(".")) {
//            System.out.println("Please enter a whole dollar amount, no change.\n");
//        } else if (feed.matches("\\d+")) {
//            balance = balance.add(new BigDecimal(Integer.parseInt(feed)));
//        } else {
//            System.out.println("Please enter valid number.\n");
//        }
//    }

    public BigDecimal getBalance() {
        return balance;
    }

    public boolean makePurchase(double price){
        if (balance.compareTo(new BigDecimal(price)) > 0) {
            balance = balance.subtract(new BigDecimal(price));
            balance = balance.setScale(2, RoundingMode.HALF_EVEN);
            return true;
        } else {
            System.out.println("Insufficient funds.\n");
            return false;
        }
    }

    public void getChange() {
        int dollarCount = 0;
        int quarterCount = 0;
        int dimeCount = 0;
        int nickelCount = 0;
        int pennyCount = 0;

       double change = balance.doubleValue();
        while (change > 0){
            if (change >= dollar) {
                change -= dollar;
                dollarCount++;
            } else if (change >= quarter) {
                change -= quarter;
                quarterCount++;
            } else if (change >= dime) {
                change -= dime;
                dimeCount++;
            } else if (change >= nickel) {
                change -= nickel;
                nickelCount++;
            } else if (change >= penny) {
                change -= penny;
                pennyCount++;
            } else
                break;
        }
        balance = new BigDecimal("0.00");
        System.out.println("Your change is " + dollarCount + " Dollar(s), " + quarterCount + " Quarter(s), " + dimeCount + " Dime(s), "
                + nickelCount + " Nickel(s), and " + pennyCount + " Pennie(s)" );
    }

    public void auditCustomer(Item item, String transactionType) {
        File dataFile = new File("Audit.txt");
        try (PrintWriter dataOutput = new PrintWriter(new FileOutputStream(dataFile, true))) {
            dataOutput.println(">>" + LocalDateTime.now() + "");
        } catch (FileNotFoundException exception) {

        }
    }
}
