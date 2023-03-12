package HW1;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите язык для вывода приветствия:");
        System.out.println("1 - Английский");
        System.out.println("2 - Французский");
        System.out.println("3 - Испанский");
        System.out.println("4 - Немецкий");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Bonjour!");
                break;
            case 3:
                System.out.println("¡Hola!");
                break;
            case 4:
                System.out.println("Hallo!");
                break;
            default:
                System.out.println("Неверный выбор.");
                break;
        }
    }
}

