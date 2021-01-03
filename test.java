import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        double levelProsperity = Double.parseDouble(scan.nextLine());
        double minimumSalary = Double.parseDouble(scan.nextLine());
        double socialScholarship = 0;
        double excellentScholarship = 0;


        if (income <= minimumSalary && levelProsperity >= 4.5) {
            socialScholarship = Math.floor(minimumSalary * 0.35);
        }
        if (levelProsperity >= 5.5) {
            excellentScholarship = Math.floor(levelProsperity * 25);
        }
        if (excellentScholarship > socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        } else if (excellentScholarship < socialScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
