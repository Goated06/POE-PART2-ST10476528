public class Password {
    //Checks if username contains "_" and is 5 characters or less
    public static boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username captured successfully.");
            return true;
        } else {
            System.out.println("Invalid username. It must contain an underscore (_) and be no more than 5 characters long.");
            return false;
        }
    }
    //Checks if the password is atleast 8 characters long
    public static boolean checkPassword(String password) {
        if (password.length() >= 8) {
            System.out.println("Password captured successfully.");
            return true;
        } else {
            System.out.println("Invalid password. It must be at least 8 characters long.");
            return false;
        }
    }
    //Checks if phone number starts with +27 and is valid length
    public static boolean checkPhone(String phone) {
        if (phone.startsWith("+27") && phone.length() == 12) {
            System.out.println("Phone number captured successfully.");
            return true;
        } else {
            System.out.println("Invalid phone number. Please use the format +27 followed by 9 digits (e.g. +27812345678).");
            return false;
        }
    }
}
