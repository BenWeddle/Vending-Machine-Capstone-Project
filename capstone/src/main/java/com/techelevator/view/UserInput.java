package com.techelevator.view;

import com.techelevator.CaTEringCapstoneCLI;

import java.util.Locale;
import java.util.Scanner;

public class UserInput extends Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Transaction thisCustomer = new Transaction();

    public static boolean getHomeScreenOption(Menu menu) {

        System.out.println("(D) Display catering items");
        System.out.println("(P) Purchase");
        System.out.println("(E) Exit menu");


        System.out.println("\nPlease select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        switch (option) {
            case "D":
                System.out.println("******************************\n");
                menu.getInventory();
                System.out.println("\n******************************");
                return true;
            case "P":
                purchaseMenu(menu);
                return true;
            case "E":
                return false;
            default:
                return true;
        }
    }

    public static void purchaseMenu(Menu menu){
        System.out.println("(M) Feed money");
        System.out.println("(S) Select item");
        System.out.println("(F) Finish transaction");

        System.out.println("\nYour current balance is: " + thisCustomer.getBalance());

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        switch (option) {
            case "M":
                System.out.println("Please enter a whole dollar amount: ");
                thisCustomer.addToBalance(Integer.parseInt(scanner.nextLine()));
            case "S":
                menu.printInventory();
                if (scanner.nextLine().toUpperCase();
            case "F":
            default:
        }

    }
}
