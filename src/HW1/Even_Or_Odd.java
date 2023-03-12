package HW1;

import java.util.Scanner;
public class Even_Or_Odd {


        public static void main(String[] args) {
            Scanner checkNumber = new Scanner(System.in);
            System.out.print("Введите число для проверки: ");
            int number = checkNumber.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " - чётное число");
            } else {
                System.out.println(number + " - нечётное число");
            }
        }
    }