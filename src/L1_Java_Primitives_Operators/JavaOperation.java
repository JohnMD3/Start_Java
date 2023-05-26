import java.util.Scanner;

public class JavaOperation {
    public static void main(String[] args) {


        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a:");
        a = input.nextInt();
        System.out.println("Enter b:");
        b = input.nextInt();



        double result1 = a + b;
        double result2 = a - b;
        double result3 = a * b;
        double result4 = a / b;
        double result5 = a % b;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


        System.out.println("initial " + a ); //100
        System.out.println("2st " +  ++a ); //100

        System.out.println("1st " + a++ ); //101

        System.out.println("3st " + a ); //102


        a +=5; //=   a = a + 5;
        a = a + 5;
        a -= 5;
        a *=5;
        a /=5;
        a %=5;

        boolean b1, b2;

        if (a > b) System.out.println("a > b");
        if (a < b) System.out.println("a < b");
        if (a >= b) System.out.println("a >= b");
        if (a <= b) System.out.println("a <= b");
        if (a == b) System.out.println("a == b");
        if (a != b) System.out.println("a != b");

        b1 = true;
        b2 = false;


        if (b1 & b2) System.out.println("b1 & b2 = true");
        if (b1 | b2) System.out.println("b1 & b2 = true");
        if (!(b1 & b2)) System.out.println("b1 & b2 = true");
        if (b1 && b2) System.out.println("b1 & b2 = true");
        if (b1 || b2) System.out.println("b1 & b2 = true");


    }
}
