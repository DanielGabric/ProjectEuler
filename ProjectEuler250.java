import java.util.*;
public class ProjectEuler250{
    static long mod =10000000000000000L;
    public static void main(String[]args){
        long remainders[]=new long[250];
        remainders[0]=1;
        int  amt[]=new int[250251];
        int N = 250250;
        for(int i=1;i<=N;++i)amt[i]=Library.powMod(i,i,250);
        for (int i = 1; i <= N; i++){
            long[]newArr = remainders.clone();
            for (int j = 0; j < 250; j++)
                newArr[j] = (remainders[((j-amt[i]) + 250) % 250] + newArr[j]) % mod;
            remainders=newArr;
        }
        System.out.println(remainders[0]-1);
    }
}