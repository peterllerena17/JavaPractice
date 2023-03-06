package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {

        // practicing with  IO exceptions
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch(Exception e){
            System.out.println("Sorry an error has occured. " + e.getMessage());
            e.printStackTrace();
        }



    }

    public static double calcPay(double hours, double payRate) throws NegativeInputExeption{
        if(hours > 40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        }
        if (hours < 0 || payRate < 0){
            throw new NegativeInputExeption();
        }
        return hours * payRate;
    }


}

