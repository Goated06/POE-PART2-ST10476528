import java.util.Scanner;

public class LoginSystem {

    static Scanner input = new Scanner(System.in);

    public static void login(String storedUsername, String storedPassword) {
        System.out.println("\n==============================");
        System.out.println("            LOGIN             ");
        System.out.println("==============================");

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();
        while (true){
            if (username.equals(storedUsername) && password.equals(storedPassword)) {
                System.out.println("\nWelcome back, " + username + "! Great to see you again.");
                Messaging.startchat();
                MessagingDetails details = new MessagingDetails();
                details.displayMessage(username);
                break;

            } else {
                System.out.println("\nIncorrect username or password. Please try again.");
                System.out.print("Username: ");
                username = input.nextLine();
                System.out.print("Password: ");
                password  = input.nextLine();
            }

        }
    }
}
