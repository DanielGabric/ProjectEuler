//NOT FINISHED YET
import java.util.*;
public class ProjectEuler485{
    static int U=100000000,K=10;
    static int[]factors = new int[U+1];
    static ArrayList<ArrayList<Integer>
    public static void main(String[]args){
        Arrays.fill(factors,2);
        factors[0]=0;
        factors[1]=1;
        int range1=U-K+1,range2; 
        long sum=0;
        int min = 2, max = factors.length/2;
        for(int divisor = min;divisor<=max;++divisor)
            for(int multiple = divisor*2;multiple<U+1;multiple +=divisor)
                factors[multiple]++;
            
        System.out.println(maximum);
        //Generate factors that are prime and make some kind of data structure to store for O(1) look up time
        //
        System.out.println(sum);
    }
}