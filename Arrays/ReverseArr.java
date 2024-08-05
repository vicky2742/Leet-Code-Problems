
public class ReverseArr {
    public static void reverseArr(int arr[], int n) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // output function for array
    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print("Original array :");
        displayArr(arr);

        System.out.println();

        System.out.print("Reverse arrar :");
        reverseArr(arr, arr.length);
        displayArr(arr);

    }
}
