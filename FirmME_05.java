import java.util.Scanner;

public class FirmME_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double workingDays = days * 0.9;
        double workHours = workingDays * 8;
        double extraHours = workers * 2 * days;

        double sumHours = Math.floor(workHours + extraHours);

        if (hours > sumHours) {
            System.out.printf("Not enough time!%.0f hours needed.", hours - sumHours);
        } else {
            System.out.printf("Yes!%.0f hours left.", sumHours - hours);
        }


    }
}
