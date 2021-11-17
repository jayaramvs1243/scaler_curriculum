package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDMatrix_Sum_Of_Columns {

    public static void main(String[] args) {
        TwoDMatrix_Sum_Of_Columns object = new TwoDMatrix_Sum_Of_Columns();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(9, 2, 3, 4));
        A.add(a1);
        A.add(a2);
        A.add(a3);

        ArrayList<Integer> result = object.sumOfColumns(A);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i) + " ");
        }
    }

    /**
     * 
     * @param A VECTOR OF VECTOR OF INTEGERS REPRESENTING MATRIX A
     * @return VECTOR CONATINING COLUMN-WISE SUMS OF ORIGINAL MATRIX
     * 
     * TC : O(N^2)
     * SC : O(N)
     */
    private ArrayList<Integer> sumOfColumns(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>(A.size());

        int sum;
        for (int col = 0; col < A.get(0).size(); col++) {
            sum = 0;
            for (int row = 0; row < A.size(); row++) {
                sum += A.get(row).get(col);
            }

            result.add(sum);
        }

        return result;
    }

}
