package HW1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+ для суммы, / для среднего значения, > для сравнения): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '/':
                result = (num1 + num2) / 2;
                break;
            case '>':
                if (num1 > num2) {
                    System.out.println(num1 + " больше " + num2);
                } else if (num1 < num2) {
                    System.out.println(num1 + " меньше " + num2);
                } else {
                    System.out.println(num1 + " равно " + num2);
                }
                break;
            default:
                System.out.println("Ошибка! Неверный оператор.");
                return;
        }

        System.out.println("Результат: " + result);

    }
}
