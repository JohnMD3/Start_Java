package L1_Java_Primitives_Operators;

import java.util.Scanner;

public class GoToWorkOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Today is weekday? Answer true or false");
        boolean isWeekday = input.nextBoolean();

        System.out.println("Today is holiday? Answer true or false");
        boolean isHoliday = input.nextBoolean();



        if (isWeekday & isHoliday) System.out.println("Its not weekend but you can stay home, because it's holiday.");
        if (!isWeekday | isHoliday) System.out.println("Its not weekend or holiday, so stay home.");
        if (isWeekday & !isHoliday) System.out.println("It's  weekend or not holiday, so go to work. ");




        boolean goToWork = isWeekday & !isHoliday;






    }
}
