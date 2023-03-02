package objects;

import java.util.Scanner;

public class HomeAreaCalculator {
    static Scanner scanner = new Scanner(System.in);


    // Use objects as parameters
    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);


    }

    public static void main(String[] args) {





    }
}
