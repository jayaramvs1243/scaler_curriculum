package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Reverse {

    public static void main(String[] args) {
        Arrays_Reverse object = new Arrays_Reverse();

        List<Integer> A1 = new ArrayList<>(Arrays.asList(20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11));

        System.out.println("APPROACH 1 : ");
        System.out.println(object.reverse(A1));
    }

    /**
     * 
     * @param a1 AN ARRAY A OF INTEGERS OF SIZE N
     * @return REVERSE OF ARRAY
     * 
     *         TC : SC :
     */
    private ArrayList<Integer> reverse(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>(A.size());
        for (int i = 0; i < A.size(); i++) {
            result.add(0);
        }

        for (int i = 0; i < A.size() / 2; i++) {
            result.set(i, A.get(A.size() - 1 - i));
            result.set(A.size() - 1 - i, A.get(i));
        }

        return result;
    }

}
