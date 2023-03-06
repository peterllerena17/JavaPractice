package exceptions;

public class NegativeInputExeption extends Exception{

    public NegativeInputExeption(){
        this("Input must be greater than or equal to 0");
    }
    public NegativeInputExeption(String message){
        super(message);
    }

}
