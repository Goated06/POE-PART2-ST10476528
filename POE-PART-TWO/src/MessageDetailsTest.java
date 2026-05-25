public class MessageDetailsTest {

    // Main method used to test MessageDetails class
    public static void main(String[] args) {

        // Example username for testing
        String loggedInUser = "user_";

        // Create MessageDetails object
        MessagingDetails details = new MessagingDetails();

        // Display the message details
        details.displayMessage(loggedInUser);
    }
}