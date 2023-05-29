package HomeWorksL2;

import java.util.Scanner;

public class Num1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int spaceCount = 0;
        char input;

        System.out.println("Введите символы. Для завершения введите точку (.)");

        do {
            input = sc.next().charAt(0);

            if (input == ' ') {
                spaceCount++;
            }
        } while (input != '.');

        System.out.println("Количество пробелов: " + spaceCount);

    }
}
