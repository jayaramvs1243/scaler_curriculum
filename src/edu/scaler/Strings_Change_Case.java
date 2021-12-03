package edu.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings_Change_Case {

    public static void main(String[] args) {
        Strings_Change_Case object = new Strings_Change_Case();

        ArrayList<Character> characterArray = new ArrayList<>(
            Arrays.asList('S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'));
        System.out.println(object.toLower(characterArray));
        System.out.println(object.toUpper(characterArray));

    }

    private ArrayList<Character> toLower(ArrayList<Character> characterArray) {
        char character;
        for (int i = 0; i < characterArray.size(); i++) {
            character = characterArray.get(i);
            if (character >= 'A' && character <= 'Z') {
                characterArray.set(i, (char) (character + 32));
            }
        }

        return characterArray;
    }

    private ArrayList<Character> toUpper(ArrayList<Character> characterArray) {
        char character;
        for (int i = 0; i < characterArray.size(); i++) {
            character = characterArray.get(i);
            if (character >= 'a' && character <= 'z') {
                characterArray.set(i, (char) (character - 32));
            }
        }

        return characterArray;
    }

}
