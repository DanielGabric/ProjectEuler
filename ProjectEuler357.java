public class ProjectEuler357 extends Library{
    static boolean[]isPrime;
    public static void main(String[] args) {
        int N = 100000000;
        long sum = 1;
        sieve(100000005);
        out:
        for (int n = 2; n <= N; n += 4) {
            if (isSquare(n))continue;
            if(getFactors(n))sum += n;
        }
        System.out.println(sum); 
    }
    public static boolean getFactors(int n) {
        for (int d = 1; d <= Math.sqrt(n); ++d) {
            int p = d+n/d;
            if (n % d == 0)
                if(!isPrime[p])return false;
        }
        return true;
    }
}
