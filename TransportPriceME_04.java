import java.util.Scanner;

public class TransportPriceME_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kilometers = Integer.parseInt(scan.nextLine());
        String dayNight = scan.nextLine();

        double price = 0;

        if (dayNight.equals("day")) {
            if (kilometers < 20) {
                price = kilometers * 0.79 + 0.70;
                System.out.printf("%.2f", price);
            } else if (kilometers >= 100) {
                price = 0.06 * kilometers;
                System.out.printf("%.2f", price);
            } else {
                price = 0.09 * kilometers;
                System.out.printf("%.2f", price);
            }
        } else if (dayNight.equals("night")){
            if (kilometers < 20) {
                price = kilometers * 0.90 + 0.70;
                System.out.printf("%.2f", price);
            } else if (kilometers >= 100) {
                price = 0.06 * kilometers;
                System.out.printf("%.2f", price);
            } else {
                price = 0.09 * kilometers;
                System.out.printf("%.2f", price);
            }
        }

    }
}
