import java.math.*;
//Modified PE116
public class ProjectEuler117 {
    static BigInteger factorial[] = new BigInteger[55];
    public static void main(String[] args) {
        factorial[0] = BigInteger.ONE;
        for (int i = 1; i < factorial.length; ++i) 
            factorial[i] = factorial[i - 1].multiply(BigInteger.valueOf(i));
        int N = 50;
        BigInteger count = BigInteger.ZERO;
        for(int i=0;i*2<=N;++i)
            for(int j=0;3*j+i*2<=N;++j)
                for(int k=0;4*k+3*j+2*i<=N;++k){
                    int n = N - (i*2+j*3+k*4)+i+j+k;
                    count = count.add(choose(n,i).multiply(choose(n-i,j)).multiply(choose(n-i-j,k)));
                }
        System.out.println(count);
    }
    public static BigInteger choose(int n, int r) {
        return factorial[n].divide(factorial[n - r].multiply(factorial[r]));
    }
}
