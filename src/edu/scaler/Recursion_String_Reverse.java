package edu.scaler;

import java.util.Scanner;

/**
 * REVERSE OF STRING
 */
public class Recursion_String_Reverse {
    public static void main(String[] args) {
        Recursion_String_Reverse object = new Recursion_String_Reverse();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String A = input.nextLine();

        System.out.println(object.reverse(A));

        input.close();
    }

    private String reverse(String input) {
        char[] characterArray = input.toCharArray();
        
        characterArray = reverseCharacterArray(characterArray, 0, characterArray.length - 1);

        StringBuilder result = new StringBuilder(characterArray.length);
        for (int i = 0; i < characterArray.length; i++) {
            result.append(characterArray[i]);
        }
        return result.toString();
    }

    private char[] reverseCharacterArray(char[] characterArray, int left, int right) {
        if (left >= right) {
            return characterArray;
        }

        char swap = characterArray[left];
        characterArray[left] = characterArray[right];
        characterArray[right] = swap;

        return reverseCharacterArray(characterArray, left + 1, right - 1);
    }
}
