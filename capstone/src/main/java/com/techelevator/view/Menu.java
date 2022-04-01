package com.techelevator.view;

import com.techelevator.CaTEringCapstoneCLI;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends CaTEringCapstoneCLI {
    private List<Item> inventory = new ArrayList<>();


    public Menu() {
        try (Scanner scanner = new Scanner(new File("catering.csv"))) {
            while (scanner.hasNextLine()) {
                String itemLine = scanner.nextLine();
                String[] thisLineAsArray = itemLine.split(",");
                inventory.add(new Item(thisLineAsArray[0], thisLineAsArray[1], thisLineAsArray[2], Double.parseDouble(thisLineAsArray[3]), 7));
            }
        } catch (IOException exception) {
            System.out.println("Cannot restock machine");
        }
    }

    public void printInventory() {
        for (Item item : inventory) {
            System.out.println(item.getWholeName());
        }
    }
    public void getInventory(String input){
        for (Item item : inventory){
           if (input.equals(item.getiD())) {
               if (item.getQuantityInStock() > 0){
                   System.out.println();
               }
           }
        }

    }
    public double removeFromInventory(String getId){
        for (Item item : inventory){
            item.getiD()
        }
    }

}
