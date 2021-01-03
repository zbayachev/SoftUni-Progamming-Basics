import java.util.Scanner;

public class WorldSwimmingRecordEX_07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timeOneMeter = Double.parseDouble(scan.nextLine());

        double timeDistance = distance * timeOneMeter;

        double timesSlow = Math.floor(distance / 15);
        double slow = timesSlow*12.5;

        double finResult = timeDistance + slow;

        if (finResult >= recordSeconds){
            System.out.printf("No, he failed! He was %.2f seconds slower.", finResult - recordSeconds);

        } else
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finResult);



    }
}
