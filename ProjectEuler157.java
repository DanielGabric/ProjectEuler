package projecteulersol;

import java.math.BigInteger;
import java.util.*;

public class ProjectEuler157 extends Library {
    public static void main(String[] args) {
        double first = System.currentTimeMillis();
        int n = 1;
        long c=0;
        for (int i = 1; i <=9; ++i) {
            //Factors of 10^n
            ArrayList<Integer> factor = getFactors(n *= 10);
            ArrayList<Integer> seen = new ArrayList<Integer>();
            for(int j=0;j<factor.size();++j){
                int a = factor.get(j);
                for(int k=j;k<factor.size();++k){
                    int b = factor.get(k);
                    if((gcd(a,b)!=1))continue;
                    int p = 0;
                    //Generate P value
                    p = (a+b)*(n/(a*b));
                    //Check if P has been processed before
                    if(seen.contains(p))continue;
                    //Adds P to the seen list
                    seen.add(p); 
                    //Adding all the P factors
                    c += getFactors(p).size();
                    
                }
            }
            
        }
        System.out.println(c);
    }
}
