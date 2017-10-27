import java.util.Scanner;

public class Operators {


    public static void main(String[] args) {


        int i = 5;
        int tYear;
        int tMonth;
        int tDay;
        int bYear;
        int bMonth;
        int bDay;
        String val = "";


        Scanner scanner = new Scanner(System.in);


        while (!val.equals("end")) {
            System.out.println("Enter current month (01-12)");
            tMonth = scanner.nextInt();
            System.out.println("Enter current day (DD)");
            tDay = scanner.nextInt();
            System.out.println("Enter current year");
            tYear = scanner.nextInt();

            System.out.println("Enter Birth month (01-12)");
            bMonth =scanner.nextInt();
            System.out.println("Enter birth day (DD)");
            bDay = scanner.nextInt();
            System.out.println("Enter birth year");
            bYear = scanner.nextInt();

            System.out.println("The current date is");
            System.out.println(tMonth);
            System.out.println(tDay);
            System.out.println(tYear);
            System.out.println("Your Birthday is");
            System.out.println(bMonth);
            System.out.println(bDay);
            System.out.println(bYear);

            System.out.println("You are");
            System.out.println(tYear - bYear);
            System.out.println("years old");
        }
    }
}
