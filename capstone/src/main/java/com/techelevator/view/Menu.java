package com.techelevator.view;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Item> inventory = new ArrayList<>();


    public Menu(List<Item> inventory) {
        this.inventory = inventory;
        try (Scanner scanner = new Scanner("catering.csv")){
        while (scanner.hasNextLine())
    }

    public boolean run() {

    }


// to-do -- build out


}
