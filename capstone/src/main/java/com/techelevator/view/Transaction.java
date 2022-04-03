package com.techelevator.view;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Transaction{
    private static BigDecimal balance = new BigDecimal("0.00");

    final BigDecimal dollar = new BigDecimal("1.00");
    final BigDecimal quarter = new BigDecimal("0.25");
    final BigDecimal dime = new BigDecimal("0.10");
    final BigDecimal nickel = new BigDecimal("0.05");
    final BigDecimal penny = new BigDecimal("0.01");


    public void addToBalance(String feed) {
        if (feed.contains(".")) {
            System.out.println("Please enter a whole dollar amount, no change.\n");
        } else if (feed.matches("\\d+")) {
            int feedAsInt = Integer.parseInt(feed);
            if (feedAsInt == 1 || feedAsInt == 5 || feedAsInt == 10 || feedAsInt == 20) {
                balance = balance.add(new BigDecimal(Integer.parseInt(feed)));
            } else {
                System.out.println("\nPlease enter a whole dollar amount such as: $1, $5, $10, or $20.\n");
            }

        } else {
            System.out.println("Please enter valid number.\n");
        }
    }


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
//        balance = balance.add(new BigDecimal("0.00001"));
        while (balance.compareTo(new BigDecimal("0.00")) > 0){
            if (balance.compareTo(dollar) >= 0) {
                balance = balance.subtract(dollar);
                dollarCount++;
            } else if (balance.compareTo(quarter) >= 0) {
                balance = balance.subtract(quarter);
                quarterCount++;
            } else if (balance.compareTo(dime) >= 0) {
                balance = balance.subtract(dime);
                dimeCount++;
            } else if (balance.compareTo(nickel) >= 0) {
                balance = balance.subtract(nickel);
                nickelCount++;
            } else if (balance.compareTo(penny) >= 0) {
                balance = balance.subtract(penny);
                pennyCount++;
            } else
                break;
        }
//        while (balance.compareTo(new BigDecimal("0.00")) > 0){
//            if (balance.compareTo(new BigDecimal(dollar)) >= 0) {
//                balance = balance.subtract(new BigDecimal(dollar));
//                dollarCount++;
//            } else if (balance.compareTo(new BigDecimal(quarter)) >= 0) {
//                balance = balance.subtract(new BigDecimal(quarter));
//                quarterCount++;
//            } else if (balance.compareTo(new BigDecimal(dime)) >= 0) {
//                balance = balance.subtract(new BigDecimal(dime));
//                dimeCount++;
//            } else if (balance.compareTo(new BigDecimal(nickel)) >= 0) {
//                balance = balance.subtract(new BigDecimal(nickel));
//                nickelCount++;
//            } else if (balance.compareTo(new BigDecimal(penny)) >= 0) {
//                balance = balance.subtract(new BigDecimal(penny));
//                pennyCount++;
//            } else
//                break;
//        }
        balance = new BigDecimal("0.00");
        System.out.println("Your change is " + dollarCount + " Dollar(s), " + quarterCount + " Quarter(s), " + dimeCount + " Dime(s), "
                + nickelCount + " Nickel(s), and " + pennyCount + " Pennie(s)" );
    }

    public void auditCustomerPurchase(Item item) {
        File dataFile = new File("Audit.txt");
        if (dataFile.exists()) {
            try (PrintWriter dataOutput = new PrintWriter(new FileOutputStream(dataFile, true))) {
                dataOutput.printf("%-22s%-22s%-22s\n",">", LocalDateTime.now(), item.getName() +
                        " " + item.getID(), "$" + balance.add(new BigDecimal(item.getPrice())) + " $" + balance);
            } catch (FileNotFoundException exception) {

            }
        } else {
            try {
                dataFile.createNewFile();
            } catch (IOException exception) {
                exception.getMessage();
            }
        }
    }
    public void auditCustomerFeed(String feedAmount) {
        int feedAmountAsInt = Integer.parseInt(feedAmount);
        File dataFile = new File("Audit.txt");
        if (dataFile.exists()) {
            try (PrintWriter dataOutput = new PrintWriter(new FileOutputStream(dataFile, true))) {
                dataOutput.printf("%22s%-22s%-22s\n",">", LocalDateTime.now(), "$" + feedAmountAsInt + " $" + balance);
            } catch (FileNotFoundException exception) {

            }
        } else {
            try {
                dataFile.createNewFile();
            } catch (IOException exception) {
                exception.getMessage();
            }
        }
    }
}
