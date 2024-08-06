public class InterSection {
    public static void intersectionOfArr(int arr1[], int arr2[]) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            }

            else if (arr1[i] == arr2[j]) {
                System.out.println("("+arr1[i] + "," + arr2[j]+")");
                i++;
                j++;
            }

            else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[]={1,2,4};
        int arr2[]={3,4};

        intersectionOfArr(arr1, arr2);
    }
}
