import java.util.Scanner;

public class GodzilaVsKongEX_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int artists = Integer.parseInt(scanner.nextLine());
        double wear = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceWear = wear * artists;

        if (artists > 150) {
            priceWear = priceWear * 0.90;
        }
        double totalExpenses = decor + priceWear;

        if (budget < totalExpenses) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalExpenses - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalExpenses);
        }

    }
}

