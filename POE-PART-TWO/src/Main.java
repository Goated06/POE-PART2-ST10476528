public class Main {

    public static void main(String[] args) {
        String[] userData = Registeration.register();
        if (userData != null) {
            LoginSystem.login(userData[0], userData[1]);
        }

    }
}
