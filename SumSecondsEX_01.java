import java.util.Scanner;

public class SumSecondsEX_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());

        int totSec = time1 + time2 + time3;

        int minutes = totSec / 60;
        int seconds = totSec % 60;

        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }


    }
}
