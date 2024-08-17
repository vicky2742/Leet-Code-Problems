public class MaxOccuringChar {
    public static char maxCharOccur(String s) {
        int count = 0, maxi = -1;
        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int no = 0;
            // lowercase
            if (ch >= 'a' && ch <= 'z') {
                no = ch - 'a';
            }
            // uppercase
            else {
                no = ch - 'A';
            }

            arr[no]++;
        }

        for (int i = 0; i < 26; i++) {
            if (maxi < arr[i]) {
                count = i;
                maxi = arr[i];
            }
        }
        char finalAns = (char) ('a' + count);
        return finalAns;

    }

    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(maxCharOccur(str));
    }
}
