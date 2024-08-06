import java.util.*;

public class DuplicateFreq {

   //!all duplicate element
   
   public static void duplicateElement(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] == arr[i]) {
               System.out.print(arr[j] + " ");
            }
         }
      }
   }

   // ! frequency

   public static void duplicateFreq(int arr[]) {
      Arrays.sort(arr);

      int i, j, freq;

      for (i = 0; i < arr.length; i++) {
         freq = 1;
         for (j = i + 1; j < arr.length; j++) {
            if (arr[j] == arr[i]) {
               freq++;
            } else {
               break;
            }
         }
         i = j - 1;
         if (freq > 1) {
            System.out.println(arr[i] + " --> " + freq);
         }
      }
   }

   // !find unique element

   public static void unique(int arr[], int n) {
      int ans = 0;
      for (int i = 0; i < n; i++) {
         ans = ans ^ arr[i];
      }

      System.out.println(ans);
   }

   public static void main(String[] args) {

      int[] array = { 2, 3, 5, 4, 3, 1, 3, 2, 1 };

      System.out.print("Duplicate element :");
      duplicateElement(array);
      System.out.println();
      System.out.println("Their frequency");
      duplicateFreq(array);

   }

}