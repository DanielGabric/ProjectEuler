//Sieve
public class ProjectEuler179 {
    public static void main(String[] args) {
        int n = (int)Math.pow(10,7);
        int[]array=new int[n+1];
        for(int i=1;i<=n;++i)
            for(int j=1;j*i<=n;++j)
                    array[i*j]++;
        int c=0;
        for(int i=1;i<n;++i)
            if(array[i]==array[i+1])c++;
        System.out.println(c);
    }
} 
