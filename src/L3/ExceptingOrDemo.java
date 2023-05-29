package L3;

import java.util.Scanner;

public class ExceptingOrDemo {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Is the product on 50 %discount? ");
//        boolean isDiscounted = in.nextBoolean();
//        boolean isDiscounted = false;
//
//
//        System.out.println("Do you have 20% discount card? ");
//        boolean hasCard = in.nextBoolean();
//
//
//
//        System.out.println("Enter product price: ");
//        double initialPrice = in.nextDouble();
//        double finalPrice;

        boolean one = false;
        boolean two = true;
        boolean three = true;



        if (one ^ two ^ three){
            System.out.println("returns TRUE ");
//            if (isDiscounted) finalPrice = initialPrice /=2;
//            else finalPrice = initialPrice * 0.8;



        } else {

            System.out.println("returns FALSE");
//            if (isDiscounted) {
//                System.out.println("WARNING You cannot apply the discount to already discount product. You have card but it is not applicable");
//                finalPrice = initialPrice /= 2;
//            } else {
//                System.out.println("Nether the product is discounted for you have discount card, so pay full price ");
//                finalPrice = initialPrice;
//            }
        }


//        System.out.println("The discount has been applied. The final product price is " + initialPrice);


    }
}
