import java.util.Scanner;


public class MessagingDetails {

    private String recipientNumber;
    private String message;

    Scanner input = new Scanner(System.in);

    // Constructor
    public MessagingDetails() {
        System.out.print("Enter recipient number: ");
        recipientNumber = input.nextLine();

        System.out.print("Enter your message: ");
        message = input.nextLine();
    }

    // Display message details
    public void displayMessage(String username) {
        System.out.println("\n========== MESSAGE DETAILS ==========");
        System.out.println("Logged in user : " + username);
        System.out.println("Recipient No   : " + recipientNumber);
        System.out.println("Message        : " + message);
        System.out.println("=====================================");
    }
}

