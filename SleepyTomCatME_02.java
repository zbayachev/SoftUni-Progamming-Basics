import java.util.Scanner;

public class SleepyTomCatME_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysOff = Integer.parseInt(scan.nextLine());

        int daysAtWork = 365 - daysOff;
        int minPlayOff = daysOff * 127;
        int minPlayAtWork = daysAtWork * 63;
        int totalPlayTime = minPlayAtWork + minPlayOff;

        if (totalPlayTime < 30000){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", (30000 - totalPlayTime) / 60, (30000 - totalPlayTime) % 60);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", (totalPlayTime - 30000)/60, (totalPlayTime-30000)%60);
        }
    }
}
