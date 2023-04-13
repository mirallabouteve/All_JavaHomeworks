package HW_Java;
import java.util.Scanner;
public class longestWord {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите предложение: ");
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Самое длинное слово: " + longestWord);
        }


}
