package exercises;

import java.util.Scanner;

public class Methods {


    // method to create sum of two ints
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    // checks if a sum is negative or positive
    public static boolean isSumNegative(int a, int b){
        int s = a + b;
        if (s < 0){
            return true;
        } else {
            return false;
        }
    }


    public static void isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            System.out.println("Congrats you have been approved!");
        } else{
            System.out.println("Sorry you have been declined.");
        }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println();
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        isUserQualified(creditScore, salary);

    }
}
