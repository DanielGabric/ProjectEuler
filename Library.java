import java.math.*;
import java.util.*; 

public class Library {
    //Factorial
    public static long f(long n){
        long s = 1;
        for(long i=1;i<=n;++i)s*=i;
        return s;
    }
    
    // Returns the reverse of the given string.
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Tests whether the given string is a palindrome.
    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    // Tests whether the given integer is a palindrome in decimal.
    public static boolean isPalindrome(int x) {
        return isPalindrome(Integer.toString(x));
    }

    // Returns floor(sqrt(x)).
    public static int sqrt(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number");
        }
        int y = 0;
        for (int i = 32768; i != 0; i >>>= 1) {
            y |= i;
            if (y > 46340 || y * y > x) {
                y ^= i;
            }
        }
        return y;
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (n < 9) {
            return true;
        }
        if (n % 3 == 0) {
            return false;
        }

        long counter = 5;
        while ((counter * counter) <= n) {
            if (n % counter == 0) {
                return false;
            }
            if (n % (counter + 2) == 0) {
                return false;
            }
            counter += 6;
        }

        return true;
    }

    public static boolean isPrime(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        if (n.compareTo(BigInteger.valueOf(2)) == 0) {
            return true;
        }
        if (n.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
            return false;
        }
        if (n.compareTo(BigInteger.valueOf(9)) == -1) {
            return true;
        }
        if (n.remainder(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO) == 0) {
            return false;
        }

        long counter = 5;
        while (n.compareTo(BigInteger.valueOf(counter * counter)) >= 0) {
            if (n.remainder(BigInteger.valueOf(counter)).compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
            if (n.remainder(BigInteger.valueOf(counter + 2)).compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
            counter += 6;
        }

        return true;
    }

    public static boolean isPaliNum(long num) {
        long n = num;
        long rev = 0;
        while (num > 0) {
            long dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        return n == rev;
    }
    // Returns floor(sqrt(x)).

    public static long sqrt(long x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number");
        }
        long y = 0;
        for (long i = 1L << 31; i != 0; i >>>= 1) {
            y |= i;
            if (y > 3037000499L || y * y > x) {
                y ^= i;
            }
        }
        return y;
    }

    // Tests whether x is a perfect square.
    public static boolean isSquare(int x) {
        if (x < 0) {
            return false;
        }
        int sqrt = Library.sqrt(x);
        return sqrt * sqrt == x;
    }
    // Tests whether x is a perfect square.

    public static boolean isSquare(long x) {
        long sqrt = Library.sqrt(x);
        return sqrt * sqrt == x;
    }
    // Tests whether x is a perfect square.

    public static boolean isSquare(double x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    public static boolean isDiv(int c, int div) {
        int quo = (int) (c / div);
        return quo * div == c;
    }
    // Returns x to the power of y.

    public static int pow(int x, int y) {
        if (y < 0) {
            throw new IllegalArgumentException("Negative exponent");
        }
        int z = 1;
        for (int i = 0; i < y; i++) {
            if (Integer.MAX_VALUE / z < x) {
                throw new ArithmeticException("Overflow");
            }
            z *= x;
        }
        return z;
    }

    public static boolean[] sieve(int N) {
        boolean[] isPrime = new boolean[N+1];  //[(N + 1)/3];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        
         for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= N; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        /*for (int i = 5, t = 2; i*i < N; i += t, t = 6 - t) {

            if (isPrime [i / 3]) {
                for (int j = i * i, v = t; j < N; j += v * i, v = 6 - v)
                    isPrime [j / 3] = false; 
            }
        }*/
        return isPrime;
    }

    public static ArrayList<Integer> sieveN(int START, int END) {
        boolean[] isPrime = Library.sieve(END);
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < isPrime.length; ++i) {
            if (
                isPrime[i] && i >= START) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static ArrayList<Integer> sieveSquares(int N) {
        boolean[] isPrime = Library.sieve(N);
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < isPrime.length; ++i) {
            if (isPrime[i]) {
                primes.add(i * i);
            }
        }
        return primes;
    }

    public static ArrayList<Integer> getFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int d = 1; d * d <= n; ++d) {
            int p = d + n / d;
            if (n % d == 0) {
                factors.add(d);
                factors.add(n / d);
            }
        }
        return factors;
    }

    public static boolean isSmallDigit(long n) {
        while (n > 0) {
            long r = n % 10;
            if (r > 2) {
                return false;
            }
            n = (long) (n / 10);
        }
        return true;
    }

    public static boolean isSmallDigit(BigInteger n) {
        while (n.compareTo(BigInteger.ZERO) == 1) {
            BigInteger r = n.remainder(BigInteger.TEN);
            if (r.compareTo(BigInteger.valueOf(2)) == 1) {
                return false;
            }
            n = n.divide(BigInteger.TEN);
        }
        return true;
    }

    public static boolean isSmallDigit(int n) {
        while (n > 0) {
            int r = n % 10;
            if (r > 2) {
                return false;
            }
            n = (int) (n / 10);
        }
        return true;
    }

    public static ArrayList<Integer> getPrimeFactors(int n) {

        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int d = 2; d * d <= n; ++d) {
            if (n % d == 0) {
                if (Library.isPrime(d)) {
                    factors.add(d);
                }
                if (Library.isPrime(n / d)) {
                    factors.add(n / d);
                }
            }
        }
        return factors;
    }

    public static ArrayList<Long> getPrimeFactors(long n) {

        ArrayList<Long> factors = new ArrayList<Long>();
        for (long d = 2; d * d <= n; ++d) {
            if (n % d == 0) {
                if (Library.isPrime(d)) {
                    factors.add(d);
                }
                if (Library.isPrime(n / d)) {
                    factors.add(n / d);
                }
            }
        }
        return factors;
    }
    // Returns x^y mod m.

    public static int powMod(int x, int y, int m) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative base not handled");
        }
        if (y < 0) {
            throw new IllegalArgumentException("Reciprocal not handled");
        }
        if (m <= 0) {
            throw new IllegalArgumentException("Invalid modulus");
        }

        // Exponentiation by squaring
        int z = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                z = (int) ((long) z * x % m);
            }
            x = (int) ((long) x * x % m);
            y >>>= 1;
        }
        return z;
    }
    public static long powMod(long x, long y, long m) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative base not handled");
        }
        if (y < 0) {
            throw new IllegalArgumentException("Reciprocal not handled");
        }
        if (m <= 0) {
            throw new IllegalArgumentException("Invalid modulus");
        }

        // Exponentiation by squaring
        long z = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                z = (long) ((long) z * x % m);
            }
            x = (long) ((long) x * x % m);
            y >>>= 1;
        }
        return z;
    }

    // Returns n!.
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number");
        }
        BigInteger prod = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    }

    // Returns n choose k.
    public static BigInteger c(int n, int k) {
        return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
    }
 
    // Returns the largest non-negative integer that divides both x and y.
    public static int gcd(int x, int y) {
        while (y != 0) {
            int z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    public static BigInteger gcd(BigInteger x, BigInteger y) {
        while (y.compareTo(BigInteger.ZERO) != 0) {
            BigInteger z = x.remainder(y);
            x = y;
            y = z;
        }
        return x;
    }

    public static boolean nextPermutation(int[] a) {
        int i, n = a.length;
        for (i = n - 2;; i--) {
            if (i < 0) {
                return false;
            }
            if (a[i] > a[i + 1]) {
                break;
            }
        }
        for (int j = 1; i + j < n - j; j++) {
            int tp = a[i + j];
            a[i + j] = a[n - j];
            a[n - j] = tp;
        }
        int j;
        for (j = i + 1; a[j] >= a[i]; j++);
        int tp = a[i];
        a[i] = a[j];
        a[j] = tp;
        return true;
    }
    // Returns the number of integers in the range [1, n] that are coprime with n.
    // For example, totient(12) = 4 because these integers are coprime with 12: 1, 5, 7, 11.

    public static long totient(long n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Totient of non-positive integer");
        }
        long p = 1;
        for (long i = 2, end = Library.sqrt(n); i <= end; i++) {  // Trial division
            if (n % i == 0) {  // Found a factor
                p *= i - 1;
                n /= i;
                while (n % i == 0) {
                    p *= i;
                    n /= i;
                }
                end = Library.sqrt(n);
            }
        }
        if (n != 1) {
            p *= n - 1;
        }
        return p;
    }

    // Returns an array 'totients' where totients[i] == totient(i), for 0 <= i <= n.
    // For a large batch of queries, this is faster than calling totient() for each integer.
    public static long[] listTotients(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative size");
        }
        long[] totients = new long[(int) n + 1];
        for (int i = 0; i <= n; i++) {
            totients[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (totients[i] == i) {  // i is prime
                for (int j = i; j <= n; j += i) {
                    totients[j] = totients[j] / i * (i - 1);
                }
            }
        }
        return totients;
    }
}
