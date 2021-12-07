package edu.scaler;

public class Strings_Longest_Palindrome {
    public static void main(String[] args) {
        Strings_Longest_Palindrome object = new Strings_Longest_Palindrome();

        String A = "malayalam";
        System.out.println(object.isPalindrome(A.toCharArray(), 0, A.length() - 1));
        System.out.println(object.longestPalindrome(A));
    }

    private Integer longestPalindrome(String A) {
        char[] characterArray = A.toCharArray();
        
        Integer longestPalindrome = Integer.MIN_VALUE;
        for (int i = 0; i < characterArray.length - 1; i++) {
            for (int j = characterArray.length - 1; j > i; j++) {
                if (isPalindrome(characterArray, i, j)) {
                    return (j - i + 1);
                }
            }
        }

        return longestPalindrome;
    }

    private boolean isPalindrome(char[] characterArray, int start, int end) {
        int mid = (end - start) / 2;

        int i, j;
        if ((end - start) % 2 == 0) {
            i = mid - 1;
            j = mid + 1;
        } else {
            i = mid;
            j = mid + 1;
        }

        while (i >= start && j <= end) {
            if (characterArray[i] != characterArray[j]) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }


}
