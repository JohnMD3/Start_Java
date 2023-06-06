package HomeWorksL3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Choice your favorite language : ");
        System.out.println("1. English");
        System.out.println("2. German");
        System.out.println("3. Russian");
        System.out.println("4. Romanian");
        System.out.println("5. Other");



        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("Hello!");
                break;
            case 2:
                System.out.printf("Hallo!");
                break;
            case 3:
                System.out.printf("Привет!");
                break;
            case 4:
                System.out.printf("Salut!");
                break;
            case 5:
                System.out.printf("Coming soon!");
        }
    }
}
