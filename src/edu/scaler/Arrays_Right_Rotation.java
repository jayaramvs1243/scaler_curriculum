package edu.scaler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays_Right_Rotation {
    public static void main(String[] args) {
        Arrays_Right_Rotation object = new Arrays_Right_Rotation();
        
        Scanner input = new Scanner(System.in);

        int arrayLength = input.nextInt();

        List<Integer> A = new ArrayList<>(arrayLength);
        for(int i = 0; i < arrayLength; i++) {
            A.add(input.nextInt());
        }

        int B = input.nextInt();

        if (B > A.size()) {
            B = B % A.size();
        }

        /* REVERSE THE ENTIRE ARRAY */
        object.reverse(A, 0, arrayLength - 1);

        /* REVERSE SUBARRAY [0, B - 1] */
        object.reverse(A, 0, B - 1);

        /* REVERSE SUBARRAY [B, N] */
        object.reverse(A, B, arrayLength - 1);

        for(int i = 0; i < arrayLength; i++) {
            System.out.print(A.get(i) + " ");
        }

        input.close();
    }

    private List<Integer> reverse(List<Integer> A, Integer start, Integer end) {
        Integer temp = 0;

        Integer mid = start + ((end - start + 1) / 2);
        for (int i = start; i < mid; i++) {
            temp = A.get(i);
            A.set(i, A.get(end - (i - start)));
            A.set(end - (i - start), temp);
        }

        return A;
    }

}
