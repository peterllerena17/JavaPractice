package exercises;

import java.util.Scanner;

public class PasswordStrength {

    private static String currentUsername = "johndoe";
    private static String currentPassword = "ABC_1234";


    public static void main(String[] args) {

        printPasswordRules();
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do{
            System.out.println("Enter your new password: ");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        } while(!valid);

        System.out.println("The proposed password is valid");


    }

    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements");
        System.out.println(" -- At least 8 characters long");
        System.out.println(" -- Contain an uppercase letter");
        System.out.println(" -- Contain a special character");
        System.out.println(" -- Not contain the username");
        System.out.println(" -- Not be the same as the old password");
        System.out.println();
    }
    public static boolean changePassword(String newPassword){
        boolean valid = true;
        String errorMessage = "";

        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters long";
        }
        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter";
        }

        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Your password must invclude a special character (e.g. %,$, $)";
        }
        if(newPassword.toUpperCase().contains(currentUsername.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different than your current password";
        }
        if(!valid){
            System.out.println(errorMessage);
        }

        return valid;

    }


}
