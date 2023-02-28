package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        // 1. Get the number of hours worked
        int hours;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours did you work this week? ");
        hours = scanner.nextInt();

        // 2. Get the hourly pay rate
        double pay_rate;
        System.out.println("What is your hourly rate? ");
        pay_rate = scanner.nextDouble();

        // close the scanner
        scanner.close();

        // 3. Multiply hours and pay rate
        double total = hours * pay_rate;

        // 4. Display result
        System.out.println("The gross pay is: " + total);






    }
}
