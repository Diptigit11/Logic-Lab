package Day3;
import java.util.Scanner;

public class mMatrixToolkit {

    // Add two matrices
    static void add(int[][] A, int[][] B, int r, int c) {
        System.out.println("Add:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Subtract two matrices
    static void subtract(int[][] A, int[][] B, int r, int c) {
        System.out.println("Subtract:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((A[i][j] - B[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Multiply matrices using triple loop
    static void multiply(int[][] A, int[][] B, int r, int c) {
        int[][] result = new int[r][c];

        /*
         * Triple loop order:
         * i -> rows of A
         * j -> columns of B
         * k -> columns of A / rows of B
         */
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Multiply:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose of first matrix
    static void transpose(int[][] A, int r, int c) {
        System.out.println("Transpose:");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Row and column sums
    static void rowColumnSum(int[][] A, int r, int c) {
        System.out.println("Row sums:");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += A[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }

        System.out.println("Column sums:");
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum += A[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read dimensions
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        // Read matrix A
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Read matrix B
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Menu
        while (true) {
            int choice = sc.nextInt();

            if (choice == 1) {
                add(A, B, r, c);
            } else if (choice == 2) {
                subtract(A, B, r, c);
            } else if (choice == 3) {
                multiply(A, B, r, c);
            } else if (choice == 4) {
                transpose(A, r, c);
            } else if (choice == 5) {
                rowColumnSum(A, r, c);
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
