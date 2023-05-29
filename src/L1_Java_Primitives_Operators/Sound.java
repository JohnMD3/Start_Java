package L1_Java_Primitives_Operators;

import java.util.Scanner;

public class Sound {

    public static void main(String[] args) {
        double distance, d2, d3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time between lightning and thunder of it:");

        float time = input.nextFloat();

        distance = time * 335;

        String my_string = "Distance to the place of lightning strike is ";

        System.out.println(my_string + distance + " meters");

    }

}
