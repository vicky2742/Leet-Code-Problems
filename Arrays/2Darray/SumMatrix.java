
public class SumMatrix {
    // !Row wise sum
    static public void rowWiseSum(int[][] matrix) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxi) {
                maxi = rowSum;
            }
            System.out.println("Row wise sum :" + rowSum);
        }
        System.out.println("largest sum of row :" + maxi);

    }

    // !Column wise sum
    static public void colWiseSum(int[][] matrix) {
        int TotalSum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[j][i];
                TotalSum += matrix[i][j];
            }
            if (rowSum > maxi) {
                maxi = rowSum;
            }
            System.out.println("Col wise sum :" + rowSum);
        }

        System.out.println("largest sum of column :" + maxi);
        System.out.println("Total sum :" + TotalSum);

    }

    static public void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        display(matrix);
        rowWiseSum(matrix);
        colWiseSum(matrix);

    }
}
