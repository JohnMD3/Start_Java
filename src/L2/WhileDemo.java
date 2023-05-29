package L2;

public class WhileDemo {
    public static void main(String[] args) {
//        while (condition) {
//            operators
//        }

//        do   {
//            operators
//        } while (condition)

        char ch;
        ch = 'a';

        System.out.print("With while: ");
        while (ch <= 'z') {
            System.out.print(ch);
            ch++;


        }
        System.out.print("\n\nWith for: ");
        for (ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }

        System.out.println();
        System.out.println(ch);
        System.out.println("\n\nWith do while");

        do {
            ch--;
            System.out.println(ch);
        } while (ch > 'a');

    }
}
