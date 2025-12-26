package Day3;

import java.util.*;

public class numberStreamAggregator {

    // Minimum value
    static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }

    // Maximum value
    static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    // Average
    static double average(int[] a) {
        int sum = 0;
        for (int x : a)
            sum += x;
        return (double) sum / a.length;
    }

    // Median
    static double median(int[] a) {
        Arrays.sort(a); // Required for median
        int n = a.length;

        if (n % 2 == 1) {
            return a[n / 2];
        } else {
            return (a[n / 2 - 1] + a[n / 2]) / 2.0;
        }
    }

    // Mode
    static int mode(int[] a) {
        int mode = a[0];
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (Integer.compare(a[i], a[j]) == 0) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = a[i];
            }
        }
        return mode;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (-999 to stop):");

        // Reading input stream
        while (true) {

            if (!sc.hasNextInt()) {
                sc.next();      // discard invalid input
                continue;
            }

            int num = sc.nextInt();

            if (num == -999)
                break;

            list.add(num);
        }

        if (list.size() == 0) {
            System.out.println("No data entered.");
            return;
        }

        // Convert ArrayList to array
        int[] arr = new int[list.size()];
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
            sum += arr[i];
        }

        System.out.println("Count=" + arr.length);
        System.out.println("Sum=" + sum);
        System.out.println("Min=" + min(arr));
        System.out.println("Max=" + max(arr));

        System.out.printf("Avg=%.2f\n", average(arr));
        System.out.printf("Median=%.2f\n", median(arr));
        System.out.println("Mode=" + mode(arr));

        sc.close();
    }
}

