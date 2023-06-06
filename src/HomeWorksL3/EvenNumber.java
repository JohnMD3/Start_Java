package HomeWorksL3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter integer number");
        a = sc.nextInt();

        if  (a % 2 == 0  ) {
            System.out.println("Your number " + a + " is even");
        } else {
            System.out.println(" Your number " + a + " is not even");
        }





    }
}
