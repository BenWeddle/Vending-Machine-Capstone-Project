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
                menu.printInventory();
                System.out.println("\n******************************");
                return true;
            case "P":
                while (purchaseMenu(menu)){
                    continue;
                }
                return true;
            case "E":
                return false;
            default:
                return true;
        }
    }

    public static boolean purchaseMenu(Menu menu){
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
                return true;
            case "S":
                menu.printInventory();
                System.out.println("\nPlease select an item: \n");
                String selectedItem = scanner.nextLine();
                if (menu.)
//                menu.removeFromInventory(selectedItem);
//                thisCustomer.getRemainingAfterPurchase(menu.getItem(selectedItem).getPrice());
//                menu.getItem(selectedItem).getCatchPhrase(menu.getItem(selectedItem).getType());
                return true;
            case "F":
                //get change method

                return false;
            default:
                return true;
        }

    }
}
