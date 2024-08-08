public class Sort012 {
    public static void sort012(int a[], int n) {

        // !count all 0,1,2
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                c0++;
            } else if (a[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }

        int idx = 0;

        for (int i = 0; i < c0; i++) {
            a[idx++] = 0;
        }

        for (int i = 0; i < c1; i++) {
            a[idx++] = 1;
        }

        for (int i = 0; i < c2; i++) {
            a[idx++] = 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 2,0,1,2 };
        int n = arr.length;

        sort012(arr, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
