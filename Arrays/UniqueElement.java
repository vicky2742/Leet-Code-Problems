public class UniqueElement {
    //!remove all repeated elements
    
    public static void uniqueElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j] && i != j) {
                    break;
                }

            }
            if (i == j) {
                System.out.print(arr[i] + " ");
            }

        }
    }
    //!find unique element

    public static void unique(int arr[],int n){
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans=ans^arr[i];
        }

        System.out.println(ans);
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 3, 5 };
        int n = arr.length;
        // uniqueElement(arr, n);

        unique(arr, n);

    }
}
