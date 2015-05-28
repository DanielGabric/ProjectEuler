import java.util.*;
import java.math.*;
public class ProjectEuler249{
    public static void main(String[]args){
        ArrayList<Integer> primes = Library.sieveN(2,4999);
        int sumSoFar=0,totSum=0,n=primes.size();
        long c = 0,mod = 10000000000000000L;
        long[]sum = new long[12500000];
        sum[0]=1;
        for(int i : primes){
            sumSoFar +=i;
            for(int j=sumSoFar;j>=i;j--)
                sum[j]=(sum[j]+sum[j-i])%mod;
        }
        for(int i=0;i<12500000;++i)if(Library.isPrime(i))c = (c+sum[i])%mod;
        System.out.println(c);
    }
} 