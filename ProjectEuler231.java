import java.util.*;
public class ProjectEuler231 extends Library{
    public static void main(String[] args) {
        ArrayList<Integer>primes = sieveN(2,20000000);
        int n = 20000000;
        int r = 15000000;
        long sum = 0;
        for(int p:primes){
            int pj=p;
            while(pj<=n){
                sum += p*(n/pj-r/pj-(n-r)/pj);
                pj*=p;
               
            }
            //sum+=p*sum1;
        }
        System.out.println(sum);
    }
    
}
