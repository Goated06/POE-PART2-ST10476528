import java.util.Scanner;

public class Registeration {
// Scanner object for user input
    static Scanner input = new Scanner(System.in);
//Method used for user registration
    public static String[] register() {
        System.out.println("\n==============================");
        System.out.println("         REGISTRATION         ");
        System.out.println("==============================");
        while (true) {
            //Ask user to create username
            System.out.print("Choose a username (max 5 chars, must include '_'): ");
            String username = input.nextLine();
            //Ask user to create password
            System.out.print("Choose a password (min 8 chars): ");
            String password = input.nextLine();
            //Ask user to enter phone number
            System.out.print("Enter your SA phone number (e.g. +27812345678): ");
            String phone = input.nextLine();
            //Validate all registration detail
            if (Password.checkUsername(username) && Password.checkPassword(password) && Password.checkPhone(phone)) {
                System.out.println("\nRegistration successful! Welcome aboard.");
                //Return username and password
                return new String[]{username, password};
            } else {
                System.out.println("\nRegistration failed. Please try again and check the requirements above.");
                return null;
            }
        }
    }
}
