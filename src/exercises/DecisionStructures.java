package exercises;

import java.util.Scanner;

public class DecisionStructures {

    public static void main(String[] args) {


        ////// If Statements
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if (sales >= quota){
            salary += bonus;
        }

        System.out.println("The employee's pay is: " + salary);


        ////////////////////////////////



        ////// If-Else Statements
        int quota2 = 10;

        System.out.println();
        System.out.println("How many sales did the employee make this week?");
        int sales2 = scanner.nextInt();
        if(sales2 >= quota2) {
            System.out.println("Congrats! you met your quota!");
        } else {
            int salesShort = quota - sales2;
            System.out.println("You missed your quota by: " + salesShort);
        }

        ///////////////////////////////////////////


        // If-Else-If
        System.out.println();
        System.out.println("Enter your test score: ");
        double score = scanner.nextDouble();

        char grade;
        if(score < 60){
            grade = 'F';
        } else if(score < 70){
            grade = 'D';
        } else if(score < 80){
            grade = 'C';
        } else if(score < 90){
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("You grade is: " + grade);



        //////////////////////////////////////////////


        // Switch Statement
        System.out.println();
        System.out.println("Enter your letter grade: ");
        String grade2 = scanner.next();

        String message;

        switch (grade2){
            case "A":
                message = "Excellent Job!!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "You can do better!";
                break;
            case "D":
                message = "Not good enough!!";
                break;
            case "F":
                message = "Reach out to me for help!!";
                break;
            default:
                message = "Error, invalid grade. Please enter a letter grade";
                break;
        }


        ////////////////////////////

        // Switch Expressions
        System.out.println();
        System.out.println("Enter your letter grade: ");
        String grade3 = scanner.next();

        String message2 = switch (grade3){
            case "A", "B" -> "Excellent Job";
            case "C" -> "Good Job";
            case "D" -> "You can do better";
            case "F" -> "See me after class";
            default -> "Invalid, please enter a letter grade";
        };



    }

}
