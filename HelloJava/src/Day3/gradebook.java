package Day3;
import java.util.Scanner;

public class gradebook {

    /**
     * Prints all students with grades.
     */
    public static void printAll(String[] names, int[] grades) {
        System.out.print("All: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "(" + grades[i] + ")");
            if (i != names.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Prints the topper (highest grade).
     */
    public static void printTopper(String[] names, int[] grades) {
        int max = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[max]) {
                max = i;
            }
        }
        System.out.println("Topper: " + names[max] + "(" + grades[max] + ")");
    }

    /**
     * Prints class average.
     */
    public static void printAverage(int[] grades) {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        double avg = (double) sum / grades.length;
        System.out.printf("Average:", avg);
    }

    /**
     * Searches student by name (case-insensitive).
     */
    public static void searchByName(String[] names, String target) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Found: " + names[i]);
                return;
            }
        }
        System.out.println("Student not found");
    }

    /**
     * Curves grades by +5 (max 100).
     */
    public static void curveGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = Math.min(grades[i] + 5, 100);
        }
        System.out.println("Grades curved by +5");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        String[] names = new String[n];
        int[] grades = new int[n];

        // Read student data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter grade: ");
            grades[i] = sc.nextInt();
            sc.nextLine(); // clear buffer
        }

        // Menu
        while (true) {
            System.out.println("\n1.Print All  2.Topper  3.Average  4.Search  5.Curve  6.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                printAll(names, grades);
            } else if (choice == 2) {
                printTopper(names, grades);
            } else if (choice == 3) {
                printAverage(grades);
            } else if (choice == 4) {
                System.out.print("Enter name to search: ");
                String name = sc.nextLine();
                searchByName(names , name);
            } else if (choice == 5) {
                curveGrades(grades);
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
                continue;
            }
        }

        sc.close();
    }
}
