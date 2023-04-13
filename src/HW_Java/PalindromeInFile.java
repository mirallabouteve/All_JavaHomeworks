package HW_Java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeInFile {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/alexe/OneDrive/Desktop/to/thisfile.txt";
        boolean isPalindrome = isPalindrome(fileName);
        if (isPalindrome) {
            System.out.println("Содержимое файла является палиндромом.");
        } else {
            System.out.println("Содержимое файла не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = "";
        String content = "";
        while ((line = br.readLine()) != null) {
            content += line;
        }
        br.close();
        content = content.replaceAll("\\W", "").toLowerCase();
        return content.equals(new StringBuilder(content).reverse().toString());
    }
}