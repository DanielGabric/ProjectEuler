//Bruteforce
public class ProjectEuler348 {
    public static void main(String[] args) {
        int c = 0;
        long sum = 0;
        long i = 100;
        while(c<5){
            if(isPali(i)){
                int a = 0;
                for(long r =1; r*r*r<i;++r){
                    long s = i-r*r*r;
                    if(isSquare(s)){
                        a++;
                    }
                }
                if(a==4){
                    c++;
                    sum+=i;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
    public static boolean isSquare(long N){
        long n = (long)Math.sqrt(N);
        return n*n==N;
    }
    public static boolean isPali(long num) {
        long n = num;
        long rev = 0;
        while (num > 0) {
            long dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        return n == rev;
    }
}
