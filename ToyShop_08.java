import java.util.Scanner;

public class ToyShop_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scan.nextLine());
        int numPuzzles = Integer.parseInt(scan.nextLine());
        int numDolls = Integer.parseInt(scan.nextLine());
        int numBears = Integer.parseInt(scan.nextLine());
        int numMinion = Integer.parseInt(scan.nextLine());
        int numTrucks = Integer.parseInt(scan.nextLine());

        double pricePuzzles = numPuzzles*2.6;
        double priceDolls = numDolls*3;
        double priceBears = numBears*4.1;
        double priceMinions = numMinion*8.2;
        double priceTrucks = numTrucks*2;

        double totNum = numBears+numDolls+numMinion+numPuzzles+numTrucks;

        double totPrice = pricePuzzles + priceDolls + priceBears + priceMinions + priceTrucks;

        if (totNum >= 50){
            double discPrice = totPrice*0.75;
            double finPrice = discPrice*0.90;

            if (finPrice >= priceExcursion){
                System.out.printf("Yes! %.2f lv left.", (finPrice-priceExcursion));
            }
            else System.out.printf("Not enough money! %.2f lv needed.", (priceExcursion - finPrice));
        }
        else if (totNum < 50){
            double finFinPrice = totPrice*0.9;

            if (finFinPrice >= priceExcursion){
                System.out.printf("Yes! %.2f lv left.", (finFinPrice-priceExcursion));
            }
            else System.out.printf("Not enough money! %.2f lv needed.", (priceExcursion-finFinPrice));
        }



    }
}
