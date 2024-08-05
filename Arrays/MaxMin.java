import java.util.Arrays;

public class MaxMin {

    // !Method 1

    // max
    // public static int maxArr(int arr[]) {
    // int maxi = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > maxi) {
    // maxi = arr[i];
    // }
    // }
    // return maxi;
    // }
    // //min
    // public static int minArr(int arr[]) {
    // int mini = Integer.MAX_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] < mini) {
    // mini = arr[i];
    // }
    // }
    // return mini;
    // }

    // !Method 2
    public static void maxMin(int arr[]) {
        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        System.out.println("Max :" + max);
        int min = arr[0];
        System.out.println("Min :" + min);

    }

    // output function for array
    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Array :");
        int arr[] = { 1, 2, 3, 4, 5 };
        displayArr(arr);
        System.out.println();
        // System.out.print("Maximum arr :");
        // System.out.println(maxArr(arr));

        // System.out.print("Minimum arr :");
        // System.out.println(minArr(arr));

        maxMin(arr);
    }
}
