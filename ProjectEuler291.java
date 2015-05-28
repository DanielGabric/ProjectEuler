import java.util.*;
import java.math.*;
public class ProjectEuler291{
    public static void main(String[]args){
        BigInteger limit = BigInteger.TEN;
        limit = limit.pow(15);
        limit = limit.multiply(BigInteger.valueOf(5));
        long c=0;
        for(long i=1;;++i){
            BigInteger b = BigInteger.valueOf(i);
            b = (b.multiply(b)).add((b.add(BigInteger.ONE)).multiply(b.add(BigInteger.ONE)));
            if(b.compareTo(limit)==1)break;
            if(b.isProbablePrime(10))c++;
        }
        System.out.println(c);
    }
} 