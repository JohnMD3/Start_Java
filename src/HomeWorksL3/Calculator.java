package HomeWorksL3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  numb1, numb2, suma, average;


        System.out.println("Enter  your first number");
        numb1 = sc.nextDouble();

        System.out.println("Enter your second number");
        numb2 = sc.nextDouble();



        suma = numb1 + numb2;
        System.out.println("The sum of your numbers is: " + suma);


        average = suma/2;
        System.out.println("The average of your numbers is: " + average);

        if (numb1 == numb2) {
            System.out.println("Your numbers are equal");
        } else  if (numb1 > numb2) {
            System.out.println("Your first number is bigger than your second number");
        } else if (numb1 < numb2) {
            System.out.println("Your second number is bigger than your first number");
        }

    }
}
