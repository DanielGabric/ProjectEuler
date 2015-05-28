public class ProjectEuler132 {
    public static void main(String[] args) {
        ArrayList<Integer> prime = Library.sieveN(2, 5000000);
        int k = (int)Math.pow(10, 9);
        int c=0;
        int sum = 0;
        /*Since any repunit of length n is (10^n-1)/9, this implies
         * (10^n - 1)/9 == 0 mod m
         * where m is an arbitrary integer
         * so 10^n - 1 == 0 mod 9m
         * and 10^n == 1 mod 9m
         * So we can do 10^n mod (PRIME) == 1
         * and keep a counter of how many primes we have looked at already
         */
        for(int i=0;c<40;++i){
            BigInteger bigOne = BigInteger.TEN;
            if((bigOne.modPow(BigInteger.valueOf(k),BigInteger.valueOf(prime.get(i)))).compareTo(BigInteger.ONE)==0){
                sum+=prime.get(i);
                c++;
            }
        }
        System.out.println(sum);
    }
} 
