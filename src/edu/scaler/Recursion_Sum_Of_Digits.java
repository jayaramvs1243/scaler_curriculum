package edu.scaler;

public class Recursion_Sum_Of_Digits {
    public static void main(String[] args) {
        Recursion_Sum_Of_Digits object = new Recursion_Sum_Of_Digits();

        int N = 1234;
        System.out.println(object.sumOfDigits(N));
    }

    private int sumOfDigits(int N) {
        if (N < 10) {
            return N;
        }

        return (N % 10) + sumOfDigits(N / 10);
    }
}
