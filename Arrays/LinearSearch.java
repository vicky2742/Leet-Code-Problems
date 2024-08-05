
public class LinearSearch {
    public static boolean linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // linearSearch(arr, 5);

        if(linearSearch(arr, 4)==true){
            System.out.println("found");
        }
        else{
            System.out.println("Not");
        }

    }
}
