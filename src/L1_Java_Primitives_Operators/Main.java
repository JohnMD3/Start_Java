import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Integer primitives");


        byte b = 127;
        short s = 16;
        int i;
        i = 32;
        long l = 65;

        System.out.println("\nVariables of type 'byte' store " + b + " bits.\nDiaposon: from -128 to 127" );
        System.out.println("\nVariables of type 'short' store " + b + " bits.\nDiaposon: from -32768 to 32767" );
        System.out.println("\nVariables of type 'int' store " + b + " bits.\nDiaposon: from -2 147 483 648 to 2 147 483 647" );
        System.out.println("\nVariables of type 'long' store " + b + " bits.\nDiaposon: from -9 2223 372 036 854 775 808  to 9 2223 372 036 854 775 808" );




        System.out.println("Floating point primitives");
        float f = 0.6f;
        double d = 0.5;


        System.out.println("\nVariables of type 'float' store 32 bits." );
        System.out.println("\nVariables of type 'double' store 64 bits." );

        char c;
        c = 'X' ;

        System.out.println("Variable c contains " + c);

        c += 1;
        System.out.println("Initial value of variable i after 'c +=1;' = " + c);
        c++;
        System.out.println("Initial value of variable i = " + c);

        boolean boo;
        boo = true;
        boo = false;

        System.out.println(boo);


        if (boo) System.out.println("boo is true");



        System.out.println("b + c = " + b + s);
        System.out.println("b + c = " + (127 + 16));
        System.out.println("b + c = " + (b + s));






    }

}


