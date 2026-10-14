
package com.example;

import java.util.Scanner;

public class FactorialCalculator {

    public static long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Negative numbers are not allowed."
            );
        }

        if (n > 20) {
            throw new IllegalArgumentException(
                "Number must not exceed 20."
            );
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            System.out.println(
                "Factorial of " + n + " is " + factorial(n)
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
