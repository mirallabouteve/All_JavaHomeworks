package HW1;

import java.util.Scanner;
import java.util.Scanner;

public class HelpClassDemo {
    public static void main(String[] args) {
        Help help = new Help();

    }

    public void run() {
        Scanner input = new Scanner(System.in);
        showmenu();
        for (;;) {

            char choice = input.next().charAt(0);

            if (choice == 'q') {
                break;
            } else {
                helpon(choice);
            }
        }
    }

    public void showmenu() {
        System.out.println("Справка: ");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("6. break");
        System.out.println("7. continue");
        System.out.print("Выберите оператор (q для выхода): ");
    }

    public void helpon(char choice) {
        switch (choice) {
            case '1':
                System.out.println("Oпepaтop if:");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:");
                System.out.println("switch(выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                break;
            case '3':
                System.out.println("Oпepaтop for:");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Oпepaтop while:");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие};");
                break;
            case '6':
                System.out.println("Oпepaтop break:");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Oпepaтop continue:");
                System.out.println("continue; или continue метка;");
                break;
            default:
                System.out.println("Недопустимый выбор.");
        }
        System.out.println();
    }

    public boolean isvalid(char choice) {
        return choice >= '1' && choice <= '7' || choice == 'q';
    }
}
