import java.util.Scanner;

public class Registeration {

    static Scanner input = new Scanner(System.in);

    public static String[] register() {
        System.out.println("\n==============================");
        System.out.println("         REGISTRATION         ");
        System.out.println("==============================");
        while (true) {
            System.out.print("Choose a username (max 5 chars, must include '_'): ");
            String username = input.nextLine();

            System.out.print("Choose a password (min 8 chars): ");
            String password = input.nextLine();

            System.out.print("Enter your SA phone number (e.g. +27812345678): ");
            String phone = input.nextLine();

            if (Password.checkUsername(username) && Password.checkPassword(password) && Password.checkPhone(phone)) {
                System.out.println("\nRegistration successful! Welcome aboard.");
                return new String[]{username, password};
            } else {
                System.out.println("\nRegistration failed. Please try again and check the requirements above.");
                return null;
            }
        }
    }
}
