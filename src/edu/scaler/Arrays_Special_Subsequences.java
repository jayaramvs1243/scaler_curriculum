package edu.scaler;

public class Arrays_Special_Subsequences {

    public static void main(String[] args) {
        Arrays_Special_Subsequences object = new Arrays_Special_Subsequences();

        String A = "ABCGAG";
        System.out.println(object.subSequence(A));
    }

    private Integer subSequence(String a) {
        char[] charArray = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            charArray[i] = a.charAt(i);
        }

        Integer answer = 0;
        Integer count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A') {
                count++;
            } else if (charArray[i] == 'G') {
                answer += count;
            }
        }

        return answer;
    }

}