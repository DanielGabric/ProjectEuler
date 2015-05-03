public class ProjectEuler130{
    public static void main(String[]args){
        long sum=0;
        for(long n=3,i=0;i<25;n+=2){
            if(n%5==0)n+=2;
            if(Library.isPrime(n))continue;
            long k=1;
            for(long repunit=1;repunit !=0;repunit=(repunit*10+1)%n,k++);  
            if((n-1)%k==0){sum+=n;i++;}
        }
        System.out.println(sum);
    }
}