import java.util.*;

public class ProjectEuler159 extends Library {

    public static void main(String[] args) {
        int[] mdrs = new int[1000000];
        long s = 0;
        for (int i = 2; i < 1000000; ++i) {
            ArrayList<Integer> f = Library.getFactorsWithout1(i);

            mdrs[i] = getDS(i);
            for (int j = 0; j < f.size() / 2; ++j) {
                int a = f.get(2*j);
                int b = f.get(2*j+1);
                mdrs[i] = Math.max(mdrs[i], mdrs[a] + mdrs[b]);
            }
            s += mdrs[i];
        }
        System.out.println(s);
    }

    public static int getDS(int n) {
        int r = n%9;
        return r==0?9:r;
    }
}
