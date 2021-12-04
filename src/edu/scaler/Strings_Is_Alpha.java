package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings_Is_Alpha {
    
    public static void main(String[] args) {
        Strings_Is_Alpha object = new Strings_Is_Alpha();

        ArrayList<Character> characterArray = new ArrayList<>(
            Arrays.asList('s', 'g', '7', 'A', 'd', 'v', 't', 'W', '4', 'A', '4', '2', '8', 'f', 'h', 'B', 'p', 'h', '7', '0', 'v', 'q', 'w', '9', 'o'));
        System.out.println(object.isAlpha(characterArray));
        System.out.println(object.isAlphaNumeric(characterArray));
    }

    private int isAlpha(ArrayList<Character> characterArray) {
        int ascii;
        for (int i = 0; i < characterArray.size(); i++) {
            ascii = characterArray.get(i);
            if (
                !((ascii >= 65 && ascii <= 90)
                   || (ascii >= 97 && ascii <= 122))
            ) {
                return 0;
            }
        }
        return 1;
    }

    private int isAlphaNumeric(ArrayList<Character> characterArray) {
        int ascii;
        for (int i = 0; i < characterArray.size(); i++) {
            ascii = characterArray.get(i);
            if (!(
                (ascii >= 65 && ascii <=90)
                || (ascii >= 97 && ascii <=122)
                || (ascii >= 48 && ascii <= 57)
                )
            ) {
                System.out.println(characterArray.get(i));
                return 0;
            }
        }
        return 1;
    }



}
