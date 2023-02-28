package exercises;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {

        //

        Random random = new Random();

        int spaces = 20;
        int spot = 0;

        for(int i  = 1; i  <= 5; i++){
            System.out.println();
            int die = random.nextInt(6) + 1;
            System.out.println("Roll #" + i + " you have rolled a " + die);
            spot += die;
            int remaining = spaces - spot;

            if(spot == spaces){
                System.out.println("Roll #" + i + " You've rolled a " + die + " You're on space 20." +
                        "Congrats, you win!");
                break;
            } else if (spot > spaces){
                System.out.println("uh oh you rolled too many, you lose!");
                break;
            } else if(i == 5 && spot < spaces){
                System.out.println("You didn't make it! Sorry you lose!");
                break;
            } else {
                System.out.println("You are now on space " + spot
                        + " and have " + remaining + " more to go");
            }
        }


    }
}
