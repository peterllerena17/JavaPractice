package exercises;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {


        // while loop
        int payRate = 15;
        int maxHours = 40;

        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("Invalid entry, your hours must be between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }

        double gross = payRate * hoursWorked;
        System.out.println("Gross Pay is: $" + gross);


        ///////////////////////////

        // Do While Loops (rarely used)
        int runAgain = 0;

        do {
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is : " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes 2 for no");
            runAgain = scanner.nextInt();

        } while(runAgain == 1);

        ////////////////////////////////////////////

        // For loops

        System.out.println("Enter the number of items you would like to scan: ");
        int quantity = scanner.nextInt();
        double total = 0;

        // syntax for For loops
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("Your total is: " + total);


        // Nested Loops

        int numberOfStudents = 5;
        int numberOfTest = 2;

        for(int j = 0; j < numberOfStudents; j++){
            double res = 0;
            for(int k = 0; k < numberOfTest; k++){
                System.out.println("Enter the score for the Test #" + (j+1));
                double d = scanner.nextDouble();
                res += d;
            }

            double average = res / numberOfTest;
            System.out.println("the test average for student #" + (j+1) + " is " + average);
        }


        /////////////////

        // Using the break statement

        System.out.println("Enter some text: ");
        String text = scanner.next();

        boolean letterFound = false;

        // search in string to check if a char A or a is contained
        for(int z = 0; z < text.length(); z++){
            char currentLetter = text.charAt(z);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }


    }
}
