package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Sub_Array_With_Least_Average {

    public static void main(String[] args) {
        Arrays_Sub_Array_With_Least_Average object = new Arrays_Sub_Array_With_Least_Average();

        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11));
        int k = 9;
        
        System.out.println("APPROACH 1 : ");
        System.out.println(object.subArrayWithLeastAverage1(A1, k));
        
        System.out.println("APPROACH 2 : ");
        System.out.println(object.subArrayWithLeastAverage2(A1, k));
    }

    /**
     * 
     * @param a1 AN ARRAY A OF INTEGERS OF SIZE N
     * @param k INTEGER K
     * @return INDEX OF THE FIRST ELEMENT OF THE SUBARRAY OF SIZE K THAT HAS LEAST AVERAGE
     * 
     * @implNote SUBARRAY OF LENGTH k WITH LEAST SUM SINCE SUM IS DIRECTLY PROPOTIONAL TO AVG
     * 
     * 1. FIND PREFIXSUM
     * 2. ITEARTE FROM 0 to N-k
     * 3. CALCULATE SUM OF SUBARRAYS OF LENGTH k
     * 3. IF (i == 0), SUM IS PREFIX SUM OF [i + (k-1)]
     * 4. ELSE SUM IS PREFIX SUM OF [i + (k-1)] - [i - 1]
     * 
     * TC : O(N)
     * SC : O(N)
     */
    private Integer subArrayWithLeastAverage1(ArrayList<Integer> A, int k) {
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(0, A.get(0));
        for (int i = 1; i < A.size(); i++) {
            prefixSum.add(i, prefixSum.get(i - 1) + A.get(i));
        }

        Integer answer = -1;
        Integer leastSum = Integer.MIN_VALUE;

        for (int i = 0; i <= A.size() - k; i++) {
            if (i == 0) {
                leastSum = prefixSum.get(i + (k - 1));
                answer = 0;
            } else {
                if ((prefixSum.get(i + (k - 1)) - prefixSum.get(i - 1)) < leastSum) {
                    leastSum = (prefixSum.get(i + (k - 1)) - prefixSum.get(i - 1));
                    answer = i;
                }
            }
        }

        return answer;
    }
    
    /**
     * 
     * @param a1 AN ARRAY A OF INTEGERS OF SIZE N
     * @param k INTEGER K
     * @return INDEX OF THE FIRST ELEMENT OF THE SUBARRAY OF SIZE K THAT HAS LEAST AVERAGE
     * 
     * @implNote SUBARRAY OF LENGTH k WITH LEAST SUM SINCE SUM IS DIRECTLY PROPOTIONAL TO AVG
     * 
     * 1. FIND PREFIXSUM
     * 2. ITEARTE FROM 0 to N-k
     * 3. CALCULATE SUM OF SUBARRAYS OF LENGTH k
     * 3. IF (i == 0), SUM IS PREFIX SUM OF [i + (k-1)]
     * 4. ELSE SUM IS PREFIX SUM OF [i + (k-1)] - [i - 1]
     * 
     * TC : O(N)
     * SC : O(2)
     */
    private Integer subArrayWithLeastAverage2(ArrayList<Integer> A, int k) {
        for (int i = 1; i < A.size(); i++) {
            A.set(i, A.get(i - 1) + A.get(i));
        }

        Integer answer = -1;
        Integer leastSum = Integer.MIN_VALUE;

        for (int i = 0; i <= A.size() - k; i++) {
            if (i == 0) {
                leastSum = A.get(i + (k - 1));
                answer = 0;
            } else {
                if ((A.get(i + (k - 1)) - A.get(i - 1)) < leastSum) {
                    leastSum = (A.get(i + (k - 1)) - A.get(i - 1));
                    answer = i;
                }
            }
        }

        return answer;
    }

}
