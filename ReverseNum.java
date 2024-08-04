
public class ReverseNum {
    public static void main(String[] args) {
        int num = 123;
        int ans = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            // if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
            //     return 0;
            // }
            ans = (ans * 10) + lastDigit;
            num /= 10;
        }

        System.out.println(ans);
    }
}