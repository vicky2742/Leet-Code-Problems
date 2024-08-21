import java.util.Scanner;

public class Basic {
    static Scanner sc = new Scanner(System.in);

    public static void matrixPrint(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixInput(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int row, col;
        row = sc.nextInt();
        System.out.println("Row : " + row);
        col = sc.nextInt();
        System.out.println("Col : " + col);
        int matrix[][] = new int[row][col];

        matrixInput(matrix);
        matrixPrint(matrix);

    }
}