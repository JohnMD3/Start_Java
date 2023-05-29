package HomeWorks.L1;

public class InchToMeter {
    public static void main(String[] args) {

        double inch, meter;
        int counter;

        counter = 0;
        for (inch = 1; inch <= 12; inch++) {
            meter = inch * 39.37 ;
            System.out.println(inch + " дюймам соотвутствует " + meter + " метров");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
