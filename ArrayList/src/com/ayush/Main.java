package com.ayush;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong input please read instructions carefully \r");
                    printInstructions();
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Print choice options");
        System.out.println("\t 1 - Print the list of grocery items");
        System.out.println("\t 2 - Add an item to the list");
        System.out.println("\t 3 - Modify an item on the list");
        System.out.println("\t 4 - Remove an item from list");
        System.out.println("\t 5 - Search for an  item in list");
        System.out.println("\t 6 - Process Array List");
        System.out.println("\t 7 - Quit program ");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name : ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item : ");
        String item = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo,item);
    }

    public static void removeItem() {
        System.out.println("Enter the item name : ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search : ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Item found in shopping list");
        } else {
            System.out.println("Item not found in shopping list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());


        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());


        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
