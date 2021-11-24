package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Rotation {

    public static void main(String[] args) {
        Arrays_Rotation object = new Arrays_Rotation();

        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer B = 3;

        /* REVERSE THE ENTIRE ARRAY */
        object.reverse(A, 0, A.size() - 1);

        /* REVERSE SUBARRAY [0, B - 1] */
        object.reverse(A, 0, B - 1);

        /* REVERSE SUBARRAY [B, N] */
        object.reverse(A, B, A.size() - 1);

        System.out.println(A);
    }

    /**
     * 
     * @param A AN ARRAY A OF INTEGERS OF SIZE N
     * @param start START INDEX OF THE SUBARRAY TO BE REVERSED
     * @param end END INDEX OF THE SUBARRAY TO BE REVERSED
     * 
     * @return ARRAY WITH THE REVERSED SUBARRAY
     * 
     * TC : O(N/2)
     * SC : O(N)
     */
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
