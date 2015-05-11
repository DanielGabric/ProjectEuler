public class ProjectEuler94 {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 3; i <= Math.floor(1000000000 / 3); i+=2) {
            long b = (i - 1) / 2;
            long b1 = (i + 1) / 2;
            if (s((i * i - b * b))) 
                sum += (long) (3 * i - 1);
            if (s((i * i - b1 * b1))) 
                sum += (long) (3 * i + 1);
        }
        System.out.println(sum);
    }
    public static boolean s(long N){
        long s = (long)Math.sqrt(N);
        return s*s==N;
    }
}
