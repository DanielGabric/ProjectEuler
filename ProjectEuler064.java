public class ProjectEuler64 {
    public static void main(String[] args) {
        int N = 10000;
        int oddC = 0;
        for (int i = 1; i <= N; ++i) {
            if (s(i)) {
                continue;
            }
            ArrayList<Long> a = new ArrayList<Long>();
            ArrayList<Long> d = new ArrayList<Long>();
            ArrayList<Long> m = new ArrayList<Long>();
            a.add((long) Math.sqrt(i));
            d.add((long) 1);
            m.add((long) 0);
            int c=1;
            while (true) {
                m.add(d.get(c-1)*a.get(c-1)-m.get(c-1));
                d.add((i-m.get(c)*m.get(c))/d.get(c-1));
                a.add((long)((a.get(0)+m.get(c))/d.get(c)));
                if(a.get(c)==2*a.get(0)){
                    break;
                }
                c++;
            }
            int num = a.size()-1;
            if(num%2==1)oddC++;
        }
        System.out.println(oddC);
    }

    public static boolean s(long N) {
        long a = (long) Math.sqrt(N);
        return a * a == N;
    } 
}
