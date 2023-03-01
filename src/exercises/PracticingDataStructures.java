package exercises;

import java.util.Scanner;

public class PracticingDataStructures {


    // can handle any amount of input ints
    public static void calculateSum( int ...a){
        int sum = 0;
        for(int i =0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println(sum);
    }

    // Count the number of words in a string and return number of words
    public static void countWords(String text){
        String[] words = text.split(" ");
        System.out.println("These are the number of words that are in your text:" + words.length);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

    }


    // reverse a string
    public static void reverseString(String text){
        for(int i = text.length() - 1; i >= 0;i--){
            System.out.print(text.charAt(i));
        }
    }


    public static void main(String[] args) {
        String[] players = new String[10];
        players[0] = "Peter";
        System.out.println(players[0]);

        calculateSum(1,3,5,6);

        countWords("I love java!");

        reverseString("racecar");
        System.out.println();
        reverseString("Test");


    }

}
