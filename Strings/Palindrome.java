public class Palindrome {
    public static char toLowerCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        }

        else {
            return (char) (ch - 'A' + 'a');
        }
    }

    public static boolean palindrome(char ch[]) {
        int s = 0;
        int e = ch.length - 1;

        while (s <= e) {
            if (toLowerCase(ch[s]) != toLowerCase(ch[e])) {
                return false;
            }

            else {
                s++;
                e--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        // char ch[] = { 'a', 'b', 'c', 'b', 'b' };

        // if (palindrome(ch) == true) {
        // System.out.println("YES");
        // }

        // else {
        // System.out.println("NO");
        // }

        // ! method 1

        String str = "abcba";

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("No");
            }

            else {
                System.out.println("YES");
            }
        }
    }
}
