
public class CountPrime {
    // ! mtd-1
    /*
     * static boolean isPrime(int N)
     * {
     * for(int i = 2 ; i * i <= N ; i++)
     * if(N % i == 0)
     * return false;
     * return true;
     * }
     * 
     * static int countPrimes(int N)
     * {
     * if(N < 3)
     * return 0;
     * int cnt = 1;//since number is atleast 3, 2 is a prime less than N
     * for(int i = 3 ; i < N ; i += 2)
     * if(isPrime(i))
     * cnt++;
     * return cnt;
     * }
     */

    // !mtd-2

    static public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isprime = new boolean[n];
        for (int i = 0; i < n; i++) {
            isprime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (isprime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isprime[j] = false;
                }
            } 
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isprime[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(isPrime(10));
        // System.out.println(countPrimes(10));

        System.out.println(countPrimes(10));
    }
}
