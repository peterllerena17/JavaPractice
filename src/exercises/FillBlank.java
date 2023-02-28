package exercises;

import java.util.Scanner;

public class FillBlank {
    public static void main(String[] args) {

        // Quick lesson on using scanner / user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please state a season of the year: ");
        String season = scanner.next();

        System.out.println("Please provide a whole number: ");
        int num = scanner.nextInt();

        System.out.println("Please provide an adjective: ");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day," +
                "I drink a minimum of " + num + " cups of coffee.");

    }
}
