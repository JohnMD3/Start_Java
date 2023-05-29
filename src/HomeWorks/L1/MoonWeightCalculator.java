package HomeWorks.L1;

import java.util.Scanner;

public class MoonWeightCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш вес на Земле в кг: ");

        double weightEarth = scanner.nextDouble();

        double weightMoon = weightEarth * 0.17;

        System.out.println("Ваш вес на луне составляет: " + weightMoon + "кг" );

    }
}
