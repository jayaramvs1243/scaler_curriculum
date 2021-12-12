package edu.scaler;

public class Recursion_Palindrome {
    public static void main(String[] args) {
        Recursion_Palindrome object = new Recursion_Palindrome();

        String A = "naman";
        System.out.println(object.solve(A));
    }

    private int solve(String A) {
        return Recursion_Palindrome.isPalindrome(A, 0, A.length() - 1);
    }

    private static int isPalindrome(String A, int left, int right) {
        if (left >= right) {
            return 1;
        }

        if (A.charAt(left) == A.charAt(right)) {
            return Recursion_Palindrome.isPalindrome(A, left + 1, right - 1);
        }

        return 0;
    }

}
