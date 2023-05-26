package L2;

import java.util.Scanner;

public class GalToLit_HomeWork {
    public static void main(String[] args) {
        double gallons;

        double liters;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество галонов: ");
        int num = input.nextInt();

        gallons = num;

        liters = gallons * 3.7854;
        System.out.println(gallons + "галлонам соотвутсвует " + liters + " литров");
    }
}
