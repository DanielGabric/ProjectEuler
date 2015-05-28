import java.math.BigInteger;
import java.util.*;
public class ProjectEuler148 {
    public static void main(String[] args) {
        long sum = 0;
        for(long i=0;i<1000000000;++i){
            long sev = base(i,7);
            long not = nonDivisible(sev);
            sum += not;
        }
        System.out.println(sum);
    }

    public static long nonDivisible(long n){
        long r = 1;
        
        while(n>0){
            r*=((n%10)+1);
            n/=10;
        }
        return r;
    }
    public static long base(long n, long b){
        long newN=0;
        long factor = 1;
        while(n>0){
            newN +=n%b*factor;
            factor*=10;
            n/=b;
        }
        return newN;
    }
} 
