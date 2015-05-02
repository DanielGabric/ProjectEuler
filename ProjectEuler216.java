import java.util.*;
import java.math.*;
public class ProjectEuler216{
    public static void main(String[]args){
        int c = 0;
        for(long i=1;i<=50000000;++i){
            BigInteger test = BigInteger.valueOf(i);
            test = (BigInteger.valueOf(2).multiply(test).multiply(test)).subtract(BigInteger.ONE);
            if(test.isProbablePrime(10))c++;
        }
        System.out.println(c);
    }
}