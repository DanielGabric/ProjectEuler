import java.util.*;
import java.math.*;
public class ProjectEuler169{
    static BigInteger two = BigInteger.valueOf(2);
    static Map<BigInteger, BigInteger> map = new TreeMap<BigInteger,BigInteger>();
    public static void main(String[]args){
        BigInteger x = new BigInteger("10");
        x = x.pow(25);
        System.out.println(recurse(x));
    }
    public static BigInteger recurse(BigInteger val){
        if(val.compareTo(BigInteger.ONE)==0||val.compareTo(BigInteger.ZERO)==0)
            return BigInteger.ONE;
        if(map.containsKey(val))return map.get(val);
        BigInteger r;
        if(val.mod(two).compareTo(BigInteger.ONE)==0){
            r= val.subtract(BigInteger.ONE);
            r = recurse(r.divide(two));
        }else{
            BigInteger a = val.divide(two);
            r =  val.divide(two);
            a = a.subtract(BigInteger.ONE);
            r = recurse(r).add(recurse(a));
        }
        map.put(val,r);
        return r;
    }
}