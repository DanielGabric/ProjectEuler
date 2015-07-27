import java.util.*;
public class ProjectEuler485{
    static long sum=0;
    public static final int U=100000000;
    public static final int K=100000;
    public static void main(String[]args){
        int[]numDiv=new int[U+1];
        for(int i=0;i<=U;++i)numDiv[i]=0;
        for (int i = 1; i <= 10000; i++) {
            numDiv[i*i]++;
            for (int j = i+1; i*j <= U; j ++) 
                numDiv[j*i]+=2;
        }
        System.out.println(maxSlide(numDiv,U,K));
    }
    public static long maxSlide(int arr[], int n, int k){
        ArrayList<Integer>Qi=new ArrayList<Integer>();
        int i;
        for (i = 0; i < k; ++i){
            while ( (!Qi.isEmpty()) && arr[i] >= arr[Qi.get(Qi.size()-1)])
                Qi.remove(Qi.size()-1); 
            Qi.add(i);
        }
        for (;i < n; ++i){
            sum+= arr[Qi.get(0)];
            while ( (!Qi.isEmpty()) && Qi.get(0) <= i - k)
                Qi.remove(0); 
            while ( (!Qi.isEmpty()) && arr[i] >= arr[Qi.get(Qi.size()-1)])
                Qi.remove(Qi.size()-1);
            Qi.add(i);
        }
        sum+=arr[Qi.get(0)];
        return sum;
    }
}