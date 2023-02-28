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

        Rectangle room1 = new Rectangle();

        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println(areaOfRoom1);

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        System.out.println(areaOfRoom2);

        Rectangle kitchen = new Rectangle(200, 400);
        Rectangle bathroom = new Rectangle(300, 700);

        double area = calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        Rectangle bedroom = getRoom();
        Rectangle nook = getRoom();
        System.out.println("Your total area is: " + calculateTotalArea(bedroom, nook));






    }
}
