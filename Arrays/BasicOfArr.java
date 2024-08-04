import java.util.Scanner;

public class BasicOfArr {
    // Printing arrays
    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Taking input

    public static void input(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        int size = arr.length;
        System.out.print("Input of arr :");
        input(arr, size);
        System.out.print("Output of arr :");
        displayArr(arr);
    }
}
