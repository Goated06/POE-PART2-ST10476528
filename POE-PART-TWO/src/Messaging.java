import java.util.Random;
import java.util.Scanner;

public class Messaging {
    public static void startchat() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Quick Chat ");
            System.out.println("Select transaction ");
            System.out.println("Option 1 - Select Quick Chat ");
            System.out.println("Option 2 - Send Quick Chat ");
            System.out.println("Option 3 - Quit ");
            System.out.println("Enter your choice(1, 2 or 3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("feature coming soon");
                    break;

                case 2:

                    scanner.nextLine(); // clear buffer

                    boolean sendingMessages = true;

                    while (sendingMessages) {

                        System.out.println("\n===== SEND A MESSAGE =====");

                        System.out.print("Enter recipient number: ");
                        String recipient = scanner.nextLine();

                        System.out.print("Enter your message: ");
                        String message = scanner.nextLine();

                        String messageId = generateMessageId();

                        System.out.println("\nMessage sent successfully!");
                        System.out.println("Message ID       : " + messageId);
                        System.out.println("Recipient Number : " + recipient);
                        System.out.println("Message          : " + message);

                        System.out.println("\nWould you like to:");
                        System.out.println("1 - Send another message");
                        System.out.println("2 - Quit");

                        System.out.print("Enter choice: ");
                        int nextChoice = scanner.nextInt();
                        scanner.nextLine(); // clear buffer

                        if (nextChoice == 2) {

                            System.out.println("Returning to main menu...");
                            sendingMessages = false;



                        } else if (nextChoice != 1) {

                            System.out.println("Invalid option. Returning to menu.");
                            sendingMessages = false;
                        }
                    }

                    break;

                case 3:
                    System.out.println("Goodbye");
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

    private static String generateMessageId() {
        Random random = new Random();
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            id.append(random.nextInt(10));
        }
        return id.toString();
    }
}