import java.util.Scanner;

public class FuelTankME_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        if ((fuel.equals("Diesel"))&(quantity >= 25)){
            System.out.println("You have enough diesel.");
        } else if ((fuel.equals("Diesel"))&(quantity < 25)){
            System.out.println("Fill your tank with diesel!");
        } else if ((fuel.equals("Gasoline"))&(quantity < 25)){
            System.out.println("Fill your tank with gasoline!");
        } else if ((fuel.equals("Gasoline"))&(quantity >= 25)){
            System.out.println("You have enough gasoline.");
        } else if ((fuel.equals("Gas"))&(quantity < 25)){
            System.out.println("Fill your tank with gas!");
        } else if ((fuel.equals("Gas"))&(quantity >= 25)){
            System.out.println("You have enough gas.");
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
