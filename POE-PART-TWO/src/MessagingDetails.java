import java.util.Scanner;


public class MessagingDetails {
//Store the recipients phone number
    private String recipientNumber;
    //Stores the messages entered by the user
    private String message;

    // Scanner object for user input
    Scanner input = new Scanner(System.in);

    // Constructor used to capture message details
    public MessagingDetails() {

        // Ask user for recipient number
        System.out.print("Enter recipient number: ");
        recipientNumber = input.nextLine();

        // Ask user to type message
        System.out.print("Enter your message: ");
        message = input.nextLine();
    }

    // Method used to display message details
    public void displayMessage(String username) {

        System.out.println("\n========== MESSAGE DETAILS ==========");
        System.out.println("Logged in user : " + username);
        System.out.println("Recipient No   : " + recipientNumber);
        System.out.println("Message        : " + message);
        System.out.println("=====================================");
    }
}

