package com.ayush;

import java.util.Scanner;

class Stack {
    static final int MAX = 1000;
    int top;
    int[] a = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top];
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

class Main {
    private static Stack s = new Stack();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        printOptions();

        while (!quit) {
            System.out.println("Enter choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> quit = true;
                case 1 -> push();
                case 2 -> pop();
                case 3 -> peek();
                case 4 -> printStack();
                case 5 -> printOptions();
                default -> {
                    System.out.println("Enter the correct option from the list. ");
                    printOptions();
                }
            }
        }

    }

    private static void printOptions() {
        System.out.println("""
                Choose from following actions :\s
                0. to quit
                1. push into stack
                2. pop from stack
                3. peek in stack
                4. print the stack
                5. print the available actions
                """);
    }

    private static void push() {
        System.out.println("Enter a value to push : ");
        int value = scanner.nextInt();
        scanner.nextLine();
        s.push(value);
    }

    private static void pop() {
        System.out.println(s.pop() + " is popped out of the stack.");
    }

    private static void peek() {
        System.out.println(s.peek() + " is the top element.");
    }

    private static void printStack() {
        System.out.println("The element in the stack are as follows: ");
        s.print();
    }
}