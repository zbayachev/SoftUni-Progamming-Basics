import java.util.Scanner;

public class FlowerShopME_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magnol = Integer.parseInt(scan.nextLine());
        int zumb = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int cactuses = Integer.parseInt(scan.nextLine());
        double pricePresent = Double.parseDouble(scan.nextLine());

        double priceFlowers = (magnol * 3.25 + zumb * 4 + roses * 3.5 + cactuses * 8) * 0.95;

        if (priceFlowers >= pricePresent) {
            System.out.printf("She is left with %.0f leva.", Math.floor(priceFlowers - pricePresent));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(pricePresent - priceFlowers));
        }
    }
}
