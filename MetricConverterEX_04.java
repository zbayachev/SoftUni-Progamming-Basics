import java.util.Scanner;

public class MetricConverterEX_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        String metric = scan.nextLine();
        String result = scan.nextLine();

        double conv = 0;

        if ((metric.equals("m")) & (result.equals("cm"))) {
            conv = number * 100;
            System.out.printf("%.3f", conv);
        } else if ((metric.equals("m")) & (result.equals("mm"))) {
            conv = number * 1000;
            System.out.printf("%.3f", conv);
        } else if ((metric.equals("cm")) & (result.equals("m"))) {
            conv = number / 100;
            System.out.printf("%.3f", conv);
        } else if ((metric.equals("cm")) & (result.equals("mm"))) {
            conv = number * 10;
            System.out.printf("%.3f", conv);
        } else if ((metric.equals("mm")) & (result.equals("m"))) {
            conv = number / 1000;
            System.out.printf("%.3f", conv);
        } else if ((metric.equals("mm")) & (result.equals("cm"))) {
            conv = number / 10;
            System.out.printf("%.3f", conv);
        }
    }
}

