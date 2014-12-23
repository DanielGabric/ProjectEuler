public class ProjectEuler95 {
    public static void main(String[] args) {
        boolean[] isPrime = Library.sieve(1000000);
        int max =-1;
        int low=0;
        out:
        for (int i = 2; i < 1000000; ++i) {
            int x = i;
            int c=0;
            int[] q = new int[1000001];
            int min = 1000000;
            while (true) {
                if (x > 1000000 || isPrime[x]) {
                    continue out;
                }
                q[x]++;
                if (q[x] == 2 && x != i) {
                    continue out;
                }
                if (q[i] == 2) {
                    break;
                }
                ++c;
                ArrayList<Integer> factors = Library.getFactors(x);
                x = 0;
                for (int r = 0; r < factors.size(); ++r) {
                    x += factors.get(r);
                }
                x -= factors.get(1);
                min = Math.min(x,min);
            }
            
            if(max<c){
                max = c;
                low=min;
            }
        }
        System.out.println(low);
    }
}
