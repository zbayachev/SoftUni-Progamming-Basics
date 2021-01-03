import java.util.Scanner;

public class PipesInPoolME_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int V = Integer.parseInt(scan.nextLine());
        int P1 = Integer.parseInt(scan.nextLine());
        int P2 = Integer.parseInt(scan.nextLine());
        double H = Double.parseDouble(scan.nextLine());

        double volumePipe1 = P1 * H;

        double volumePipe2 = P2 * H;


        double sum = volumePipe1 + volumePipe2;
        double percentPipe1 = volumePipe1/sum*100;
        double percentPipe2 = volumePipe2/sum*100;
        double percentSum = sum/V*100;

        if (sum <= V){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%% .",percentSum, percentPipe1, percentPipe2);
        } else System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, sum - V);
    }
}
