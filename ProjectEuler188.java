public class ProjectEuler188 {
    public static void main(String[] args) {
        int r = 1777,w = 1855;
        BigInteger sum = BigInteger.ONE;
        while(w>0){
            sum = BigInteger.valueOf(r).modPow(sum, BigInteger.valueOf((long)Math.pow(10,8)));
            --w;
        }
        System.out.println(sum);
    }
}
