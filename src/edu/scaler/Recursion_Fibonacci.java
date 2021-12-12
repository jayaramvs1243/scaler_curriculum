package edu.scaler;

public class Recursion_Fibonacci {
    public static void main(String[] args) {
        int A = 9;
        System.out.println(Recursion_Fibonacci.findAthFibonacci(A));
    }

    private static int findAthFibonacci(int A) {
        if (A == 0) {
            return 0;
        } else if (A == 1) {
            return 1;
        } else {
            return Recursion_Fibonacci.findAthFibonacci(A - 2) + Recursion_Fibonacci.findAthFibonacci(A - 1);
        }
    }
}
