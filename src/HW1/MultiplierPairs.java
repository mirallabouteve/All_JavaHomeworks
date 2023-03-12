package HW1;

import java.util.Scanner;
public class MultiplierPairs {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = input.nextInt();
            System.out.println("Пары множителей:");
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(i + ", " + number / i);

            }

        }


    }

}
