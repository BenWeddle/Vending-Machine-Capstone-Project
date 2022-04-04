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
    public String  getCatchPhrase(String userInput) {
        if (userInput.equals("Munchy")) {
            userInput = "Munchy, Munchy, so Good!";
            System.out.println("Munchy, Munchy, so Good!");
        } else if (userInput.equals("Sandwich")) {
            userInput = "Sandwich So Delicious, Yum!";
            System.out.println("Sandwich So Delicious, Yum!");
        } else if (userInput.equals("Drink")) {
            userInput = "Drinky, Drinky, Slurp Slurp!";
            System.out.println("Drinky, Drinky, Slurp Slurp!");
        } else if (userInput.equals("Dessert")) {
            userInput = "Sugar, Sugar, so Sweet!";
            System.out.println("Sugar, Sugar, so Sweet!");
        } else {
            System.out.println("Yummy mystery snack?");
        }

        return userInput;
    }

    public void dispenseItem() {
        if (quantityInStock > 0) {
            quantityInStock--;
        }
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
}
