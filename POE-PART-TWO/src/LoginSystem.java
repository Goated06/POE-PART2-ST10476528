import java.util.Scanner;

public class LoginSystem {
    //Scanner object for login input
    static Scanner input = new Scanner(System.in);
    //Method used for logging into the system
    public static void login(String storedUsername, String storedPassword) {
        System.out.println("\n==============================");
        System.out.println("            LOGIN             ");
        System.out.println("==============================");
        //Ask user for username
        System.out.print("Username: ");
        String username = input.nextLine();
        //Ask user for password
        System.out.print("Password: ");
        String password = input.nextLine();
        while (true){
            //Check if entered details match registered details
            if (username.equals(storedUsername) && password.equals(storedPassword)) {
                System.out.println("\nWelcome back, " + username + "! Great to see you again.");
                //Open messaging system
                Messaging.startchat();
                MessagingDetails details = new MessagingDetails();
                details.displayMessage(username);
                break;

            } else {
                //Loogin failed
                System.out.println("\nIncorrect username or password. Please try again.");
                //Ask the user to try again
                System.out.print("Username: ");
                username = input.nextLine();
                System.out.print("Password: ");
                password  = input.nextLine();
            }

        }
    }
}
