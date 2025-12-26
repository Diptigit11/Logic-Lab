package Day3;
import java.util.Scanner;

public class stringAnalytics {

    /**
     * Counts frequency of vowels a, e, i, o, u (case-insensitive).
     */
    public static int[] countVowels(String s) {
        int[] vowels = new int[5]; // a e i o u

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a') vowels[0]++;
            else if (ch == 'e') vowels[1]++;
            else if (ch == 'i') vowels[2]++;
            else if (ch == 'o') vowels[3]++;
            else if (ch == 'u') vowels[4]++;
        }
        return vowels;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        // Force at least one input read
        do {
            input = sc.nextLine();
        } while (input.trim().isEmpty());

        int words = 0;
        int sentences = 0;
        int digits = 0;
        int letters = 0;
        String longestWord = "";

        String currentWord = "";

        // Manual scanning
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // Count sentences
            if (ch == '.' || ch == '!' || ch == '?') {
                sentences++;
            }

            // Count digits and letters
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                letters++;
            }

            // Build word (letters only)
            if (Character.isLetter(ch)) {
                currentWord += ch;
            } else {
                if (!currentWord.isEmpty()) {
                    words++;
                    if (currentWord.length() > longestWord.length()) {
                        longestWord = currentWord;
                    }
                    currentWord = "";
                }
            }
        }

        // Last word check
        if (!currentWord.isEmpty()) {
            words++;
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }

        int[] vowelCount = countVowels(input);

        // Output
        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.println("Digits: " + digits + ", Letters: " + letters);
        System.out.println("Longest word: \"" + longestWord + "\"");
        System.out.println(
            "Vowel freq: a=" + vowelCount[0] +
            " e=" + vowelCount[1] +
            " i=" + vowelCount[2] +
            " o=" + vowelCount[3] +
            " u=" + vowelCount[4]
        );

        sc.close();
    }
}
