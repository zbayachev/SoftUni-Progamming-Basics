import java.util.Scanner;

public class FuelTank2ME_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuel = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        String clubCard = scan.nextLine();

        double priceGasoline = 0;
        double priceDiesel = 0;
        double priceGas = 0;

        if (clubCard.equals("Yes")) {
            priceGasoline = quantity * (2.22 - 0.18);
            priceDiesel = quantity * (2.33 - 0.12);
            priceGas = quantity * (0.93 - 0.08);
        } else if (clubCard.equals("No")) {
            priceDiesel = quantity * 2.33;
            priceGas = quantity * 0.93;
            priceGasoline = quantity * 2.22;
        }
        if ((fuel.equals("Gasoline")) & (quantity < 20)) {
            System.out.printf("%.2f lv.", priceGasoline);
        } else if ((fuel.equals("Gasoline")) & (quantity <= 25)) {
            System.out.printf("%.2f lv.", priceGasoline * 0.92);
        } else if ((fuel.equals("Gasoline")) & (quantity > 25)) {
            System.out.printf("%.2f lv.", priceGasoline * 0.9);
        } else if ((fuel.equals("Gas")) & (quantity < 20)) {
            System.out.printf("%.2f lv.", priceGas);
        } else if ((fuel.equals("Gas")) & (quantity <= 25)) {
            System.out.printf("%.2f lv.", priceGas * 0.92);
        } else if ((fuel.equals("Gas")) & (quantity > 25)) {
            System.out.printf("%.2f lv.", priceGas * 0.9);
        } else if ((fuel.equals("Diesel")) & (quantity < 20)) {
            System.out.printf("%.2f lv.", priceDiesel);
        } else if ((fuel.equals("Diesel")) & (quantity <= 25)) {
            System.out.printf("%.2f lv.", priceDiesel * 0.92);
        } else if ((fuel.equals("Diesel")) & (quantity > 25)) {
            System.out.printf("%.2f lv.", priceDiesel * 0.9);
        }
    }
}







