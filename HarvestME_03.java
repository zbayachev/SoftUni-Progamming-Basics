import java.util.Scanner;

public class HarvestME_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int area = Integer.parseInt(scan.nextLine());
        double grape = Double.parseDouble(scan.nextLine());
        int wine = Integer.parseInt(scan.nextLine());
        int worker = Integer.parseInt(scan.nextLine());

//        от area намираме 40% за вино.
//        за 1л трябват 2.5кг грозде

         double areaForWine = area * 0.4;
         double totalKgGrape = areaForWine * grape;
         double literWine = totalKgGrape / 2.5;
         double winePerPerson = Math.ceil((literWine - wine) / worker);

         if (literWine >= wine){
             System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(literWine));
             System.out.printf("%.0f liters left -> %.0f liters per person.", literWine - wine, winePerPerson);
         } else {
             System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wine - literWine));
         }
    }
}
