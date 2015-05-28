import java.math.*;
public class ProjectEuler116 {
    static BigInteger[]factorial=new BigInteger[50];
    public static void main(String[] args) {   
        factorial[0]=BigInteger.ONE;
        for(int i=1;i<factorial.length;++i)factorial[i]=factorial[i-1].multiply(BigInteger.valueOf(i));
        int N = 50;
        BigInteger count = BigInteger.ZERO;
        //Lengths of red tiles
        for(int l=2;l<=4;++l){
            int factor = 1;
            //Keep incrementing the amount of red tiles while the total is less then or equal to N
            while(factor*l<=N){
                //Adding all combinations of red tiles of length l
                count = count.add(choose(N-factor*l+factor,factor));
                factor++;
            }
        }
        System.out.println(count);
    }
    public static BigInteger choose(int n, int r){
        return factorial[n].divide(factorial[n-r].multiply(factorial[r]));
    } 
}
