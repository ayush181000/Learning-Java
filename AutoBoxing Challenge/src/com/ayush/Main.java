package com.ayush;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        Bank bank = startBank();
        printActions();
        while (!quit) {
            System.out.print("Enter your choice:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 -> printActions();
                case 1 -> addBranch(bank);
                case 2 -> addCustomer(bank);
                case 3 -> addCustomerTransaction(bank);
                case 4 -> printCustomer(bank, false);
                case 5 -> printCustomer(bank, true);
                case 6 -> quit = true;
            }
        }
    }

    private static Bank startBank() {
        System.out.println("Enter Bank Name : ");
        String bankName = scanner.nextLine();
        return new Bank(bankName);
    }

    private static void printActions() {
        System.out.println("Choose your action:");
        System.out.println("0. Print the list of available actions");
        System.out.println("1. Add a branch in bank");
        System.out.println("2. Add a customer in existing branch");
        System.out.println("3. Add a transaction in existing customer");
        System.out.println("4. Print the list of existing customers (excluding transactions)");
        System.out.println("5. Print the list of existing customers (including transactions)");
        System.out.println("6. Quit program");
    }

    private static void addBranch(Bank bank) {
        System.out.println("Enter branch name : ");
        String branchName = scanner.nextLine();
        if (bank.addNewBranch(branchName)) {
            System.out.println("Successfully created branch " + branchName);
        } else {
            System.out.println("Error in creating branch " + branchName);
        }
    }

    private static void addCustomer(Bank bank) {
        System.out.println("Enter branch name : ");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name :");
        String customerName = scanner.nextLine();
        System.out.println("Enter initial amount :");
        double initialAmount = scanner.nextDouble();
        scanner.nextLine();

        if (bank.addCustomer(branchName, customerName, initialAmount)) {
            System.out.println("Successfully created a new customer " + customerName +
                    " in branch " + branchName + " with an initial amount of " + initialAmount);
        } else {
            System.out.println("Error. Branch does not exist.");
        }
    }

    private static void addCustomerTransaction(Bank bank) {
        System.out.println("Enter branch name : ");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name :");
        String customerName = scanner.nextLine();
        System.out.println("Enter initial amount :");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (bank.addCustomerTransaction(branchName, customerName, amount)) {
            System.out.println("Successfully added transaction into customer " + customerName +
                    " in branch " + branchName + " with an amount of " + amount);
        } else {
            System.out.println("Error. Branch does not exist or customer does not exist.");
        }
    }

    private static void printCustomer(Bank bank, boolean showTransactions) {
        System.out.println("Enter branch name : ");
        String branchName = scanner.nextLine();
        bank.listCustomers(branchName, showTransactions);
    }


}
