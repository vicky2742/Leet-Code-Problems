
public class ReverseString {
    public static void reverseString(char ch[]) {
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // char ch[] = { 'v', 'i', 'c', 'k', 'y' };
        // for (int i = 0; i < ch.length; i++) {
        // System.out.print(ch[i] + " ");
        // }

        // reverseString(ch);
        // System.out.println();
        // for (int i = 0; i < ch.length; i++) {
        // System.out.print(ch[i] + " ");
        // }

        //!other method

        String str = "vicky";
        System.out.print(str + " ");
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            str1 = str.charAt(i) + str1;
        }
        System.out.println();
        System.out.print(str1 + " ");
    }

}