package srp;

public class UserManager {
    public void addUser(String email, String password) {
        if (Validator.isValidEmail(email) && Validator.isValidPassword(password)) {
            DBManager.saveToDatabase(email, password);
            UserSendNotifications.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.addUser("example@domain.com", "password123");
        userManager.addUser("invalid-email", "1234");
    }
}
