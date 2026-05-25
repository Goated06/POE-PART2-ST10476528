public class Main {
// Main method where the program starts
    public static void main(String[] args) {
        //Calls the registration method amd stores returned user details
        String[] userData = Registeration.register();
        //If registration is successful, proceed to login
        if (userData != null) {
            //userData[0] = username
            //userData[1] = password
            LoginSystem.login(userData[0], userData[1]);
        }

    }
}
