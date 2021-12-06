package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_Solving_Minimum_Picks {
    public static void main(String[] args) {
        Problem_Solving_Minimum_Picks object = new Problem_Solving_Minimum_Picks();

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-92, 22, 2, 11, 39, 36, 36, 51, 71, 42));

        System.out.println("APPROACH 1 : ");
        System.out.println(object.differenceBetweenEvenMaxAndOddMin(A));
    }

    public int differenceBetweenEvenMaxAndOddMin(ArrayList<Integer> A) {
        int evenMax = Integer.MIN_VALUE, oddMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != 0) {
                if (A.get(i) % 2 == 0 && A.get(i) > evenMax) {
                    evenMax = A.get(i);
                } else if (A.get(i) % 2 != 0 && A.get(i) < oddMin) {
                    oddMin = A.get(i);
                }
            }
        }

        return evenMax - oddMin;
    }

}
