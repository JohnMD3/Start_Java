package HomeWorksL2;

import java.util.Scanner;

public class Num1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countOfSpaces = 0;
        boolean terminateInput = false;

        while (true) {
            String string = sc.nextLine();
            char[] charArray = string.toCharArray();

            for(char ch : charArray) {
                if(ch == ' ') countOfSpaces++;
                if(ch == '.') terminateInput = true;
            }

            if(terminateInput) break;
        }

        System.out.println("Количество пробелов: " + countOfSpaces);

    }
}