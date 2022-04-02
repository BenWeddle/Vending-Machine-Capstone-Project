package com.techelevator.view;

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

                thisCustomer.addToBalance(scanner.nextLine());

                return true;
            case "S":
                System.out.println("\nPlease select an item: \n");
                menu.printInventory();
                String selectedItem = scanner.nextLine().toUpperCase();
                Item checkItem = menu.getItemInInventory(selectedItem);
                if (!(checkItem == null)) {

                }
//                    if (thisCustomer.getBalance() > menu.getItemInInventory(selectedItem).getPrice()) {
//                    if (menu.getItemInInventory(selectedItem).getQuantityInStock() > 0){
//                        menu.removeFromInventory(selectedItem);
//                        thisCustomer.makePurchase(menu.getItemInInventory(selectedItem).getPrice());
//                        menu.getItemInInventory(selectedItem).getCatchPhrase(menu.getItemInInventory(selectedItem).getType());
//                    } else {
//                        System.out.println("NO LONGER AVAILABLE");
//                    }
//                } else {
//                    System.out.println("Insufficient funds.");
//                }
//                return true;
            case "F":
                //get change method

                return false;
            default:
                return true;
        }

    }
}
