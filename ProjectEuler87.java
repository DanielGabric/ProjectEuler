public class ProjectEuler87 extends Library{
    public static void main(String[] args) {
        int N = 50000000;
        ArrayList<Integer>primes = sieve(N);
        int []p=new int[N];
        for(int f=0;f<primes.size();++f){
            for(int t = 0;Math.pow(primes.get(t),3)+Math.pow(primes.get(f), 4)<50000000-Math.pow(2, 2);++t){
                for(int s = 0;Math.pow(primes.get(t),3)+Math.pow(primes.get(f), 4)+Math.pow(primes.get(s), 2)<50000000;++s){
                    p[(int)(Math.pow(primes.get(t),3)+Math.pow(primes.get(f), 4)+Math.pow(primes.get(s), 2))]++;
                }
            }
        }
        int c=0;
        for(int i=0;i<p.length;++i){
            if(p[i]>0)c++;
        }
        System.out.println(c);
    }
}
