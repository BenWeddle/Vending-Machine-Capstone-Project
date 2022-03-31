package com.techelevator.view;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {private static Scanner scanner = new Scanner(System.in);

    public static void getHomeScreenOption() {
        System.out.println("What would you like to do?");

        System.out.println("D. Display catering items");
        System.out.println("P. Purchase");
        System.out.println("E. Exit menu");


        System.out.println("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        switch (option) {
            case "D":
                return "list";
            case "P":
                return "Purchase";
            case "E":
                return "Exit";
            default:
                return "";
        }
    }
    public static String purchaseMenu(){
        System.out.println("M. Feed money");
        System.out.println("S. Select item");
        System.out.println("F. Finish transaction");


        System.out.println("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        switch (option) {
            case "M":
                return "Money";
            case "S":
                return "Item";
            case "F":
                return "Finished transaction";
            default:
                return "";
        }

    }
}
