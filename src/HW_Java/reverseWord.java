package HW_Java;

import java.util.Scanner;

public class reverseWord {

        public static void main(String[] args) {
            Scanner yourWord = new Scanner(System.in);
            String normalword = yourWord.nextLine();
            String reversedWord = "";

            for(int i = normalword.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + normalword.charAt(i);
            }

            System.out.println("Переписанное слово: " + reversedWord);
        }


}
