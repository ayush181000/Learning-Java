package com.ayush;

import java.util.*;

class Factorial {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("Factorial is = " + fact);
    }
}