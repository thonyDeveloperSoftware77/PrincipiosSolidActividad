package srp;

import java.util.regex.Pattern;

public class Validator {
    public static boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}