import java.util.Scanner;

public class PetsME_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double tortoiseFood = Double.parseDouble(scanner.nextLine());

        double neededFood = (days * dogFood)+ (days * catFood) + days * (tortoiseFood/1000);

        if (leftFood >= neededFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFood - neededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood - leftFood));
        }
    }
}
