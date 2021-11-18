package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDMatrix_Matrix_Subtraction {

    public static void main(String[] args) {
        TwoDMatrix_Matrix_Subtraction object = new TwoDMatrix_Matrix_Subtraction();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(7, 8, 9));
        A.add(a1);
        A.add(a2);
        A.add(a3);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> b1 = new ArrayList<>(Arrays.asList(9, 8, 7));
        ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(6, 5, 4));
        ArrayList<Integer> b3 = new ArrayList<>(Arrays.asList(3, 2, 1));
        B.add(b1);
        B.add(b2);
        B.add(b3);

        ArrayList<ArrayList<Integer>> result = object.subtractMatrices(A, B);
        for (int row = 0; row < result.size(); row++) {
            for (int col = 0; col < result.get(row).size(); col++) {
                System.out.print(result.get(row).get(col) + " ");
            }

            System.out.println("");
        }
    }

    /**
     * 
     * @param A VECTOR OF VECTOR OF INTEGERS REPRESENTING MATRIX A
     * @param B VECOTOR OF VECTOR OF INTEGERS REPRESENTING MATRIX B
     * @return VECTOR OF VECTOR OF INTEGERS AFTER SUBTRACTION
     * 
     * TC : O(N^2)
     * SC : O(N^2+N)
     */
    private ArrayList<ArrayList<Integer>> subtractMatrices(ArrayList<ArrayList<Integer>> A,
            ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(A.size());

        ArrayList<Integer> temp;
        for (int row = 0; row < A.size(); row++) {
            temp = new ArrayList<>();

            for (int col = 0; col < A.get(row).size(); col++) {
                temp.add(A.get(row).get(col) - B.get(row).get(col));
            }

            result.add(temp);
        }

        return result;
    }

}
