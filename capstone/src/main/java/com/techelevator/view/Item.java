package com.techelevator.view;

public class Item {
    private String name;
    private double price;
    private String iD;
    private String type;
    private int quantityInStock;


    public Item(){}

    public Item(String iD, String name, String type, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.iD = iD;
        this.type = type;
        this.quantityInStock = quantityInStock;
    }

    public String getWholeName(){
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
}
