//Simple bruteforce with few optimizations
public class ProjectEuler357 {
    static boolean[]isPrime;
    public static void main(String[] args) {
        int N = 100000000;
        long sum = 1;
        sieve(100000005);
        out:
        for (int n = 2; n <= N; n += 4) {
            if (isSquare(n)) {
                continue;
            }
            if(getFactors(n))
            sum += n;
        }
        System.out.println(sum);
    }
    public static boolean isSquare(long n) {
        long a = (long) Math.sqrt(n);
        return a * a == n;
    }
        public static boolean[] sieve(int N) {
        isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= N; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        return isPrime;
    }
    public static boolean getFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int d = 1; d <= Math.sqrt(n); ++d) {
            int p = d+n/d;
            if (n % d == 0) {
                if(!isPrime[p])return false;
            }
        }
        return true;
    }
}
