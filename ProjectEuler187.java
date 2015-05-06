//Sieve
public class ProjectEuler187 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = sieveN(2,(int)Math.pow(10,8)/2+1);
        int[]factors = new int[(int)Math.pow(10,8)+5];
        for(int i=0;i<primes.size();++i)
            for(int j=0;primes.get(i)*primes.get(j)<=Math.pow(10, 8);++j)
                factors[(primes.get((int)i)*primes.get((int)j))]++;
        int c=0;
        for(int i=0;i<factors.length;++i){
            if(Math.sqrt(i)==(int)Math.sqrt(i))
                factors[i]++;
            if(factors[i]==2)c++;
        }
        System.out.println(c);
    }
}
