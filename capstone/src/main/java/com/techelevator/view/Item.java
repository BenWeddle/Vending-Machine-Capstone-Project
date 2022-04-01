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

    public String getiD() {
        return iD;
    }

    public String getType() {
        return type;
    }
    public String getCatchPhrase(String userInput){
        if (userInput.equals("Munchy")){
            return "Munchy, Munchy, so Good!";
        } else if (userInput.equals("Sandwich")){
            return "Sandwich So Delicious, Yum!";
        }else if (userInput.equals("Drink")){
            return "Drinky, Drinky, Slurp Slurp!";
        }else if (userInput.equals("Dessert"))
            return "Sugar, Sugar, so Sweet!";

    public int getQuantityInStock() {
        return quantityInStock;
    }
}
