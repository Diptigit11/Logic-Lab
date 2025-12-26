package Day3;
import java.util.Scanner;

public class phoneBookCLI {

    static String[] names = new String[100];
    static String[] phones = new String[100];
    static int count = 0;

    // Add a contact
    static void add(String name, String phone) {

        // Validate phone number: exactly 10 digits
        if (phone.length() != 10) {
            System.out.println("Invalid phone number.");
            return;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                System.out.println("Invalid phone number.");
                return;
            }
        }

        names[count] = name;
        phones[count] = phone;
        count++;
    }

    // Delete a contact by name
    static void delete(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {

                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    phones[j] = phones[j + 1];
                }

                count--;
                System.out.println("Deleted: " + name);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Find contacts using partial match
    static void find(String sub) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].toLowerCase().contains(sub.toLowerCase())) {
                System.out.println("Found: " + names[i] + "(" + phones[i] + ")");
                found = true;
            }
        }

        if (!found)
            System.out.println("No match found.");
    }

    // List all contacts
    static void list() {
        if (count == 0) {
            System.out.println("Phonebook is empty.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(names[i] + "(" + phones[i] + ")");
            if (i < count - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String line = sc.nextLine();

            // Skip empty input lines
            if (line.trim().isEmpty())
                continue;

            // Split command by spaces
            String[] parts = line.split(" ");

            String cmd = parts[0].toUpperCase();

            if (cmd.equals("ADD")) {
                if (parts.length < 3) {
                    System.out.println("Invalid ADD command.");
                    continue;
                }
                add(parts[1], parts[2]);
            }
            else if (cmd.equals("DEL")) {
                if (parts.length < 2) {
                    System.out.println("Invalid DEL command.");
                    continue;
                }
                delete(parts[1]);
            }
            else if (cmd.equals("FIND")) {
                if (parts.length < 2) {
                    System.out.println("Invalid FIND command.");
                    continue;
                }
                find(parts[1]);
            }
            else if (cmd.equals("LIST")) {
                list();
            }
            else if (cmd.equals("EXIT")) {
                System.out.println("Goodbye.");
                break;
            }
            else {
                System.out.println("Unknown command.");
            }
        }

        sc.close();
    }
}
