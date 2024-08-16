public class UpperLowerCase {

    public static char toLowerCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        }

        else {
            return (char) (ch - 'A' + 'a');
        }
    }

    public static char toUpperCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return ch;
        }

        else {
            return (char) (ch - 'a' + 'A');
        }
    }

    public static void main(String[] args) {

        System.out.println("Lower Case :"+toLowerCase('A'));
        System.out.println("Upper Case :"+ toUpperCase('a'));

    }
}
