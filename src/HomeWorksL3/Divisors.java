package HomeWorksL3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numb, i, a1, a2;

        boolean divisors = false;

        System.out.println("Enter your integer number: ");
        numb = sc.nextInt();

        System.out.println("The factor of number " + numb + " is");

        for (i = 2; i <= numb / 2; i++) {

            if (numb % i == 0) {
                a1 = i;
                a2 = numb / i;
                System.out.println(a1 + " * " + a2);
                divisors = true;
            }
        }
        if (!divisors) {
            System.out.printf(" not has multipliers, so it is a prime number. A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers. ");
        }

    }
}
