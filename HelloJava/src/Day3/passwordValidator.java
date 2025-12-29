package Day3;

import java.util.Scanner;

public class passwordValidator {

    // Method to check if password is valid
    static boolean isValid(String pwd, String user) {

        // Rule 1: Length check
        if (pwd.length() < 8 || pwd.length() > 20)
            return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String special = "!@#$%^&*";

        // Scan each character
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            // Rule 6: No spaces
            if (ch == ' ')
                return false;

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (special.indexOf(ch) != -1) {
                hasSpecial = true;
            } else {
                // Skip non-contributing characters
                continue;
            }
        }

        // Rule 7: Username must not be part of password (case-insensitive)
        if (pwd.toLowerCase().contains(user.toLowerCase()))
            return false;

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    // Method to give feedback
    static String feedback(String pwd, String user) {
        StringBuilder fb = new StringBuilder("Feedback:\n");

        if (pwd.length() < 8)
            fb.append("- Password is too short.\n");

        if (!pwd.matches(".*[A-Z].*"))
            fb.append("- Add at least one uppercase letter.\n");

        if (!pwd.matches(".*[a-z].*"))
            fb.append("- Add at least one lowercase letter.\n");

        if (!pwd.matches(".*[0-9].*"))
            fb.append("- Add at least one digit.\n");

        if (!pwd.matches(".*[!@#$%^&*].*"))
            fb.append("- Add more special characters.\n");

        if (pwd.contains(" "))
            fb.append("- Remove spaces from password.\n");

        if (pwd.toLowerCase().contains(user.toLowerCase()))
            fb.append("- Avoid using parts of your name.\n");

        return fb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("username: ");
        String username = sc.nextLine();

        System.out.print("password: ");
        String password = sc.nextLine();

        if (isValid(password, username)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");

            // Find which part of username matched
            if (password.toLowerCase().contains(username.toLowerCase().substring(0))) {
                System.out.println(
                    "Invalid: contains username sequence \"" +
                    username.substring(1) + "\"."
                );
            }

            System.out.println(feedback(password, username));
        }

        sc.close();
    }
}
