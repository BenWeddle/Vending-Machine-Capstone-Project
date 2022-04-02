package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Transaction{
    private static BigDecimal balance = new BigDecimal("0.00");

    double dollar = 1;
    double quarter = .25;
    double dime = .10;
    double nickel = .5;
    double penny = .1;

    int dollarCount = 0;
    int quarterCount = 0;
    int dimeCount = 0;
    int nickelCount = 0;
    int pennyCount = 0;


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

    public boolean makePurchase(double price){
        if (balance.compareTo(new BigDecimal(price)) > 0) {
            balance = balance.subtract(new BigDecimal(price));
            balance = balance.setScale(2, RoundingMode.HALF_UP);
            return true;
        } else {
            System.out.println("Insufficient funds.\n");
            return false;
        }
    }
    public void getChange() {
       double change = balance.doubleValue();
        while (change > 0){
            if (change > dollar) {
                change -= dollar;
                dollarCount++;
            }else if (change > quarter) {
                change -= quarter;
                quarterCount++;
            }else if (change > dime) {
                change -= quarter;
                dimeCount++;
            }else if (change > nickel) {
                change -= nickel;
                nickelCount++;
            }else if (change > penny) {
                change -= penny;
                pennyCount++;
            }
        }
        balance = new BigDecimal("0.00");
        System.out.println("Your change is " + dollarCount+ "Dollars " + quarterCount + "Quarters " + dimeCount + "Dimes "+ nickelCount + "Nickels " + pennyCount + "Pennies" );
    }
}
