package edu.scaler;

import java.util.ArrayList;
import java.util.List;

public class Strings_Reverse_Word_By_Word {

    public static void main(String[] args) {
        Strings_Reverse_Word_By_Word object = new Strings_Reverse_Word_By_Word();

        String input = " the sky is blue ";
        System.out.println(object.sentenceReverse(input));
    }

    private String sentenceReverse(String input) {
        StringBuilder word = new StringBuilder();
        List<String> wordArray = new ArrayList<>();

        Integer i = 0;
        while (i <= input.length() - 1) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else if (input.charAt(i) == ' ' && word.length() > 0) {
                wordArray.add(word.toString());
                word = new StringBuilder();
            }
            i++;
        }
        if (word.length() > 0) {
            wordArray.add(word.toString());
        }

        word = new StringBuilder();
        for (i = 0; i < wordArray.size(); i++) {
            word.append(wordArray.get(wordArray.size() - 1 - i));
            if (i != wordArray.size() - 1) {
                word.append(" ");
            }
        }

        return word.toString();
    }

}
