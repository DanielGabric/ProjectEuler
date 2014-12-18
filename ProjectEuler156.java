/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteulersol;
import java.math.*;
public class ProjectEuler156 extends Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger s = BigInteger.ZERO;
        long f[]=new long[10];
        for(int i=0;i<2000000000;++i){
            f(f,i);
            for(int j=1;j<10;++j)
            if(f[j]==i)s = s.add(BigInteger.valueOf(f[j]));
            
            //System.out.println(i+" "+f[1]);
        }
        System.out.println(s);
        
    }
    public static void f(long[]f,int n){
        while(n>0){
            f[n%10]++;
            n/=10;
        }
    }
    
}
