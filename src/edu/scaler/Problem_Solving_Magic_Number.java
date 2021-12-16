package edu.scaler;

public class Problem_Solving_Magic_Number {
    public static void main(String[] args) {
        Problem_Solving_Magic_Number object = new Problem_Solving_Magic_Number();

        int A = 83557;
        System.out.println(object.isMagicNumber(A));
    }

    private int isMagicNumber(int A) {
        if (A % 9 == 1) {
            return 1;
        }
        return 0;
    }
}
