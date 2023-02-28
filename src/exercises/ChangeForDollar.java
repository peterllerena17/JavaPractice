package exercises;

import java.util.Scanner;

public class ChangeForDollar {

    public static void main(String[] args) {
        final double penny = 0.01;
        final double nickel = 0.05;
        final double dime = 0.10;
        final double quarter = 0.25;
        final double dollar = 1.00;

        System.out.println("Welcome to 'Change for a Dollar! Your goal is to" +
                " enter enough change to make exactly $1.00!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of pennies: ");
        int numOfPennies = scanner.nextInt();
        double valuePennies = numOfPennies * penny;

        System.out.println("Enter your number of nickels: ");
        int numOfNickels = scanner.nextInt();
        double valueNickels = numOfNickels * numOfNickels;

        System.out.println("Enter your number of Dimes: ");
        int numOfDimes = scanner.nextInt();
        double valueDimes = numOfDimes * dime;

        System.out.println("Enter your number of quarters: ");
        int numOfQuarters = scanner.nextInt();
        double valueQuarters = numOfQuarters * quarter;

        double totalValue = valuePennies + valueNickels + valueDimes + valueQuarters;

        if (totalValue == dollar){
            System.out.println("Congrats you won!!!");
        } else if (totalValue < dollar){
            System.out.println("Oh no too low! You were off by: " + (dollar - totalValue));
        } else {
            System.out.println("Toooooooo much!You were over by: " + (totalValue - dollar));
        }


    }
}
