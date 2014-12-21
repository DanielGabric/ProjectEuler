import java.util.*;
public class ProjectEuler234 extends Library {
    static ArrayList<Integer> primes = sieveN(2, 1100000);
    public static void main(String[] args) {
        long N = 999966663333L;
        long sum = 0;
        for (int i = 0; i < primes.size(); ++i) {
            long p1 = primes.get(i);
            long q1 = primes.get(i + 1);
            long p = p1 * p1 + 1;
            long q = q1 * q1 - 1;
            if (q > N)q = N;
            if (p > N || p > q)break;
            sum += (getSum(p1,p,q) + getSum(q1,p,q) - 2 * getSum(q1*p1,p,q));
        }
        System.out.println(sum);
    }

    public static long getSum(long m, long p, long q) {
        long b = ((p - 1) / m) * m;
        long x = (q - b) / m;
        long y1 = m + b;
        long yn = m * x + b;
        return x * (y1 + yn) / 2;
    }
}
