import java.math.*;
public class ProjectEuler137 {
    public static void main(String[] args) {
        BigInteger fibSum=BigInteger.ZERO;
        BigInteger fib1=BigInteger.ONE;
        BigInteger fib2=BigInteger.ONE;
        for(int i=3;i<=31;++i){
            fibSum = fib1.add(fib2);
            fib2 = fib1;
            fib1 = fibSum;
        }
        System.out.println(fib1.multiply(fib2));
    }
    
} 
