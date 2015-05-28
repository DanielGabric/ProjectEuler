//Stupid solution, bruteforce
public class ProjectEuler225 {
    public static void main(String[] args) {
        BigInteger[] trib = new BigInteger[50000];
        trib[0] = BigInteger.ONE;
        trib[1] = BigInteger.ONE;
        trib[2] = BigInteger.ONE;
        for (int i = 3; i < 50000; ++i) {
            trib[i] = trib[i - 1].add(trib[i - 2]).add(trib[i - 3]);
        }
        int start;
        int c = 0;
        out:
        for (start =1; c < 124; start += 2) {
            for (int i = 0; i < 50000; ++i) {
                if (trib[i].remainder(BigInteger.valueOf(start)).compareTo(BigInteger.ZERO) == 0) {
                    continue out;
                }
            }
            c++;
        }
        System.out.println(start-2);
    }
} 
