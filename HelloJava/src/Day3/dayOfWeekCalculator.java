package Day3;

import java.util.Scanner;

public class dayOfWeekCalculator {

    /**
     * Returns true if the year is a leap year.
     */
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * Calculates day of week using Zeller’s Congruence.
     */
    static String dayOfWeek(int d, int m, int y) {

        // If month is Jan or Feb, treat it as month 13 or 14 of previous year
        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }

        int K = y % 100; // year of century
        int J = y / 100; // zero-based century

        // Zeller's Congruence formula
        int h = (d + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;

        // Mapping index to day name
        String[] days = {
            "Saturday", "Sunday", "Monday",
            "Tuesday", "Wednesday", "Thursday", "Friday"
        };

        return days[h];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        // Validate month
        if (m < 1 || m > 12) {
            System.out.println("Invalid month");
            return;
        }

        // Days in each month
        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Adjust February for leap year
        if (m == 2 && isLeapYear(y)) {
            monthDays[1] = 29;
        }

        // Validate day
        if (d < 1 || d > monthDays[m - 1]) {
            System.out.println("Invalid day");
            return;
        }

        String result = dayOfWeek(d, m, y);
        System.out.println(result);

        sc.close();
    }
}
