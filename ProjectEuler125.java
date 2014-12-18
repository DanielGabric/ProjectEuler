public class ProjectEuler125 {
    public static void main(String[] args) {
        int limit = (int)Math.pow(10, 8);
        int[]pali=new int[limit+1];
        int sqrt = (int)Math.sqrt(limit);
        long c=0;
        for(int i=1;i<=sqrt;++i){
            int sum = i*i;
            for(int j=i+1;j<=sqrt;++j){
                sum+=j*j;
                if(sum>limit)break;
                if(p(sum))pali[sum]++;
            }
        }
        for(int i=0;i<limit+1;i++)if(pali[i]>0)c+=i;
        System.out.println(c);
    }
    public static boolean p(int N){
        String n= Integer.toString(N);
        String rN ="";
        for(int i=n.length()-1;i>=0;--i)rN+=n.charAt(i);
        return n.equals(rN);
    }
}
