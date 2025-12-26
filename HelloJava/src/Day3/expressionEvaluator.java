package Day3;

public class expressionEvaluator {

    /*
     * Evaluates a simple arithmetic expression containing
     * +, -, *, / with correct precedence.
     * Uses integer arithmetic only.
     */
    public static int evaluate(String expr) {

        int result = 0;        // Stores final result
        int lastNumber = 0;    // Stores previous number (for * and /)
        int currentNumber = 0; // Number currently being built
        char operation = '+';  // Previous operator

        for (int i = 0; i < expr.length(); i++) {

            char ch = expr.charAt(i);

            // Skip spaces
            if (ch == ' ')
                continue;

            // Build number using digits
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }

            /*
             * If operator found OR end of string,
             * apply the previous operation
             */
            if (!Character.isDigit(ch) || i == expr.length() - 1) {

                if (operation == '+') {
                    result += lastNumber;
                    lastNumber = currentNumber;
                } else if (operation == '-') {
                    result += lastNumber;
                    lastNumber = -currentNumber;
                } else if (operation == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operation == '/') {
                    if (currentNumber == 0) {
                        System.out.println("Invalid input: Division by zero");
                        System.exit(0);
                    }
                    lastNumber = lastNumber / currentNumber;
                }

                operation = ch;
                currentNumber = 0;
            }
        }

        // Add the last pending number
        result += lastNumber;
        return result;
    }

    /*
     * Validates the expression:
     * - Allows digits, spaces, and operators only
     */
    public static boolean isValid(String expr) {

        int i = 0;
        while (i < expr.length()) {
            char ch = expr.charAt(i);

            if (!(Character.isDigit(ch) || ch == ' ' ||
                  ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = " 5 + 10 * 2 / 4";

        if (!isValid(input)) {
            System.out.println("Invalid expression");
            return;
        }

        int result = evaluate(input);
        System.out.println("Result: " + result);
    }
}
