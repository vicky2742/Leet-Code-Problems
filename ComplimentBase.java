public class ComplimentBase {
    public static int bitwiseComplement(int n) {
        int m = n;
        int masks = 0;
        if (n == 0) {
            return 1;
        }
        while (m != 0) {
            masks = (masks << 1) | 1;
            m = m >> 1;
        }
        int ans = (~n) & masks;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }
}
