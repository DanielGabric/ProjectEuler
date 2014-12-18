import java.math.*;
public class ProjectEuler156 extends Library {
    public static void main(String[] args) {
        BigInteger s = BigInteger.ZERO;
        long f[]=new long[10];
        for(int i=0;i<2000000000;++i){
            f(f,i);
            for(int j=1;j<10;++j)
            if(f[j]==i)s = s.add(BigInteger.valueOf(f[j]));
        }
        System.out.println(s);
    }
    public static void f(long[]f,int n){
        while(n>0){
            f[n%10]++;
            n/=10;
        }
    }
    
}
