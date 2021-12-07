package com.numbers;

public class Series {
    public static long nSum(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int fibbonaci(int n) {
        int fibbonaci = 0, first = 0, second = 1;
        if (n == 1) {
            return first;
        } else if (n == 2) {
            return second;
        }
        for (int i = 0; i <= (n - 2); i++) {
            fibbonaci = second + first;
            first = second;
            second = fibbonaci;
        }
        return fibbonaci;
    }

}
