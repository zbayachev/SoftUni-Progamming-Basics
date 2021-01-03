import java.util.Scanner;

public class TimePlus15MinEX_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int totMinutes = hours * 60 + minutes + 15;
        int finHours = totMinutes / 60;
        int finMinutes = totMinutes % 60;

        if (finHours >= 24){
            finHours -=24;

            System.out.printf("%d:%02d", finHours, finMinutes);
        } else {
            System.out.printf("%d:%02d", finHours, finMinutes);
        }
    }
}
