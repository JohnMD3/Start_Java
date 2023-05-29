package HomeWorks.L1;

import java.util.Scanner;

public class EchoDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время через которое к вам вернулся звук эха (в секундах) ");
        double time = sc.nextDouble();

        double timeEcho = time / 2;

        double distance = timeEcho * 343;
        System.out.println("Расстояние от вас до объекта составляет: " + distance + " метров");
    }
}
