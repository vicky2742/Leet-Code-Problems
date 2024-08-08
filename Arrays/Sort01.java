
public class Sort01 {

    public static void sortZeroOne(int arr[], int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            while (arr[start] == 0 && start < end) {
                start++;
            }

            while (arr[end] == 1 && start < end) {
                end--;
            }

            if (arr[start] == 1 && arr[end] == 0 && start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    }

    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0 };
        int n = arr.length;

        sortZeroOne(arr, n);
        displayArr(arr);
    }
}