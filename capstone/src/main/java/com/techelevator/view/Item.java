package com.techelevator.view;

public class Item {
    private String name;
    private double price;
    private String iD;
    private String type;
    private int quantityInStock;


    public Item() {
    }

    public Item(String iD, String name, String type, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.iD = iD;
        this.type = type;
        this.quantityInStock = quantityInStock;
    }

    public String getWholeName() {
        return iD + ") " + name + ", " + type + ": " + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getID() {
        return iD;
    }

    public String getType() {
        return type;
    }
    public void getCatchPhrase(String userInput) {
        if (userInput.equals("Munchy")) {
            System.out.println("Munchy, Munchy, so Good!");
        } else if (userInput.equals("Sandwich")) {
            System.out.println("Sandwich So Delicious, Yum!");
        } else if (userInput.equals("Drink")) {
            System.out.println("Drinky, Drinky, Slurp Slurp!");
        } else if (userInput.equals("Dessert")){
            System.out.println("Sugar, Sugar, so Sweet!");
        } else {
            System.out.println("Yummy mystery snack?");
        }
    }

    public void dispenseItem() {
        quantityInStock--;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
}
