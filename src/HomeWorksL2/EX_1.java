package HomeWorksL2;

import java.util.Scanner;

public class EX_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countOfSpaces = 0;
        boolean terminteInput = false;

        System.out.println("Введите любые символы и пробелы (. для завершения)");

        while (true) {
            String string = sc.nextLine();
            char[] charArray = string.toCharArray();

            for(char ch : charArray) {
                if(ch == ' ') countOfSpaces++;
                if(ch == '.') terminteInput = true;
            }

            if(terminteInput) break;
        }

        System.out.println("Количество пробелов: " + countOfSpaces);

    }
}