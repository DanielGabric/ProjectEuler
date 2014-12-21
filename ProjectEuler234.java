import java.util.*;
public class ProjectEuler234 extends Library {
    //Generate at least sqrt(N) primes
    static ArrayList<Integer> primes = sieveN(2, 1100000);
    public static void main(String[] args) {
        long N = 999966663333L;
        long sum = 0;
        //Loop through primes
        for (int i = 0; i < primes.size(); ++i) {
            //Generate consecutive primes
            long p1 = primes.get(i);
            long q1 = primes.get(i + 1);
            //Here we know that sqrt(n) lies between p1 < sqrt(n) < q1
            //So we use this fact to say that p1*p1 +1 <= n <= q1*q1 -1
            long p = p1 * p1 + 1;
            long q = q1 * q1 - 1;
            //Obviously the upper bound cannot be higher than our preset N
            if (q > N)q = N;
            //If the lower bound is bigger than our upper bound
            //Or bigger than pre set N, we solved it!
            if (p > N || p > q)break;
            //Here is the tricky part
            //Think of it like a venn diagram
            //With one side being all divisible by p1
            //and the other being all divisible by q1
            //to get semidivisibles
            //We take the union, then take away the intersection
            sum += (getSum(p1,p,q) + getSum(q1,p,q) - 2 * getSum(q1*p1,p,q));
        }
        System.out.println(sum);
    }

    //Basically we are generating an arithmetic sequence for all numbers between p and q that
    //are divisible by either, p1, q1, or p1*q1
    //Then we sum them up and return it
    public static long getSum(long m, long p, long q) {
        long b = ((p - 1) / m) * m;
        long x = (q - b) / m;
        long y1 = m + b;
        long yn = m * x + b;
        return x * (y1 + yn) / 2;
    }
}
