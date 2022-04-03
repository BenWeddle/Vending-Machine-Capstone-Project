package com.techelevator.view;

import com.techelevator.CaTEringCapstoneCLI;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu extends CaTEringCapstoneCLI {
    private List<Item> inventory = new ArrayList<>();


    public Menu() {
        try (Scanner scanner = new Scanner(new File("catering1.csv"))) {
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

    public Item getItemInInventory(String input){
        boolean inputItemExists = false;
        for (Item item : inventory){
            if (input.equals(item.getID())) {
                inputItemExists = true;
                if (item.getQuantityInStock() > 0){
                    return item;
                } else {
                    System.out.println("\nNO LONGER AVAILABLE (out of stock) \n");
                    break;
                }
            }
        }
        if (inputItemExists == false) {
            System.out.println("\nSorry, that input is invalid.\n");
        }
        return null;
    }

    public List<Item> getInventory(){
        return inventory;
    }

    public boolean removeFromInventory(String getId){
        for (Item item : inventory){
            if (item.getID().equalsIgnoreCase(getId) && item.getQuantityInStock() > 0) {
                item.dispenseItem();
                return true;
            }
        }
        return false;
    }

}
