package edu.scaler;

public class Recursion_Magic_Number {
    public static void main(String[] args) {
        Recursion_Magic_Number object = new Recursion_Magic_Number();

        int A = 1291;
        System.out.println(object.isMagicNumber(A));
    }

    private int isMagicNumber(int A) {
        while (A >= 10) {
            A = sumOfDigits(A);
        }

        if (A == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    private int sumOfDigits(int N) {
        if (N < 10) {
            return N;
        }

        return (N % 10) + sumOfDigits(N / 10);
    }
}
