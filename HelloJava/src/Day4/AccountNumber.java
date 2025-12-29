package Day4;

public class AccountNumber {

    private final String digits; // immutable field

    // Constructor
    public AccountNumber(String s) {
        if (isValid(s)) {
            this.digits = s;
        } else {
            this.digits = "000000000000";
            System.out.println("Invalid account number");
        }
    }

    // Static validation method
    public static boolean isValid(String s) {
        if (s == null || s.length() != 12) return false;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    // Getter
    public String getDigits() {
        return digits;
    }

    // Testing
    public static void main(String[] args) {
        AccountNumber a = new AccountNumber("123456789012"); // valid
        AccountNumber b = new AccountNumber("ABC");          // invalid

        System.out.println("a = " + a.getDigits()); // 123456789012
        System.out.println("b = " + b.getDigits()); // 000000000000
    }
}
