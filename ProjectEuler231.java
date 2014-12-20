import java.util.*;
public class ProjectEuler231 extends Library{
    //If you think back to getting the amount of 0's at the end of a factorial
    //This is very similar
    //In effect when you were getting 0's at the end of factorial, you were successifvely dividing
    //N by powers of 5, and this got you the final numbers of factors of 5 in the N!
    //By using this property we can get the exponents of any prime in N! by
    //dividing by powers of the Prime P
    //When getting exponents in choose, just subtract all exponents of R and (N-R) from N
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
