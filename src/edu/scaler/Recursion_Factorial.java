package edu.scaler;

/**
 * FACTORIAL OF 'N' - PRODUCT OF ALL NATURAL NUMBERS FROM 'N' to 0
 * FACTORIAL OF '0' is 1
 */
public class Recursion_Factorial {
    public static void main(String[] args) {
        int A = 1;
        System.out.println(factorial(A));
    }

    private static int factorial(int A) {
        if (A == 1) {
            return 1;
        } else {
            return A * factorial(A - 1);
        }
    }
}
