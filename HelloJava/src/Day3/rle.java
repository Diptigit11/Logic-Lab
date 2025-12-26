package Day3;
import java.util.Scanner;

public class rle {

    /**
     * Compresses a string using Run-Length Encoding.
     * Example: aaabbc -> a3b2c1
     */
    public static String compress(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {

            // Skip invalid characters
            if (i < s.length() && !Character.isLetter(s.charAt(i))) {
                continue;
            }

            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }
        return result.toString();
    }

    /**
     * Checks if encoded string is valid.
     * Format: letter followed by digit(s)
     */
    public static boolean isValidEncoded(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (i % 2 == 0) { // even index should be letter
                if (!Character.isLetter(s.charAt(i))) {
                    return false;
                }
            } else { // odd index should be digit
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Decompresses an RLE encoded string.
     * Example: a3b2c1 -> aaabbc
     */
    public static String decompress(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {

            char ch = s.charAt(i);
            int count = Integer.parseInt(String.valueOf(s.charAt(i + 1)));

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Compress  2.Decompress  3.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                String input = sc.nextLine();

                // Validate letters only
                boolean valid = true;
                for (int i = 0; i < input.length(); i++) {
                    if (!Character.isLetter(input.charAt(i))) {
                        valid = false;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Invalid input. Letters only.");
                    continue;
                }

                System.out.println(compress(input));

            } else if (choice == 2) {
                String input = sc.nextLine();

                if (!isValidEncoded(input)) {
                    System.out.println("Invalid encoded format.");
                    continue;
                }

                System.out.println(decompress(input));

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
                continue;
            }
        }

        sc.close();
    }
}

