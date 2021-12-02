package edu.scaler;

public class Strings_Reverse {

    public static void main(String[] args) {

        Strings_Reverse object = new Strings_Reverse();

        String input = "MAMA";
        System.out.println(object.reverse1(input));
        System.out.println(object.reverse2(input));
        System.out.println(object.reverse3(input));

    }

    /**
     * Reverse the string and return the reversed string
     * 
     * @param First and only argument is a string A
     * @return Return a string denoting the reversed string
     * 
     * TC : O(N)
     * SC : O(1)
     */
    private String reverse1(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    /**
     * Reverse the string and return the reversed string
     * 
     * @param First and only argument is a string A
     * @return Return a string denoting the reversed string
     * 
     * TC : O(N)
     * SC : O(1)
     */
    private String reverse2(String input) {
        StringBuilder result = new StringBuilder();

        int i = input.length() - 1;
        while (i >= 0) {
            result.append(input.charAt(i));
            i--;
        }

        return result.toString();
    }

    /**
     * Reverse the string and return the reversed string
     * 
     * @param First and only argument is a string A
     * @return Return a string denoting the reversed string
     * 
     * TC : O(N/2)
     * SC : O(1)
     */
    private String reverse3(String input) {
        char[] inputArray = input.toCharArray();

        char temp;
        for (int i = 0; i <= (input.length() - 1) / 2; i++) {
            temp = inputArray[i];
            inputArray[i] = inputArray[input.length() - 1 - i];
            inputArray[input.length() - 1 - i] = temp;
        }

        return new String(inputArray).toLowerCase();
    }

}
