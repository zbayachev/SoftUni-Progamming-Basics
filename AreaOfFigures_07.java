import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        double area = 0;

        if (type.equals("square")){
            double sideSqaure = Double.parseDouble(scan.nextLine());
            area = sideSqaure*sideSqaure;
        }
        else if (type.equals("rectangle")){
            double sideRect1 = Double.parseDouble(scan.nextLine());
            double sideRect2 = Double.parseDouble(scan.nextLine());
            area = sideRect1*sideRect2;
        }
        else if (type.equals("circle")){
            double radius = Double.parseDouble(scan.nextLine());
            area = radius*radius*Math.PI;

        }
        else if (type.equals("triangle")){
            double sideTri1 = Double.parseDouble(scan.nextLine());
            double sideTri2 = Double.parseDouble(scan.nextLine());
            area = sideTri1*sideTri2/2;
        }

        System.out.printf("%.3f", area);


    }
}
