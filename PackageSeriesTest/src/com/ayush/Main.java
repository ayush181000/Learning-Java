package com.ayush;

import com.numbers.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========================\n" +
                "Sum of first 10 numbers");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println(Series.nSum(Integer.MAX_VALUE/2));

        System.out.println("=========================\n" +
                "Factorial of first 10 numbers");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("=========================\n" +
                "Fibonacci Series of first 10 numbers");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibbonaci(i));
        }
    }
}
