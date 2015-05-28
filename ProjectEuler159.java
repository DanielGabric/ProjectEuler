import java.util.*;
public class ProjectEuler159 extends Library {
    public static void main(String[] args) {
        int[] mdrs = new int[1000000];
        long s = 0;
        for (int i = 2; i < 1000000; ++i) {
            //Getting factors of i
            ArrayList<Integer> f = Library.getFactorsWithout1(i);

            //Set the initial value at index i, to be the digital root sum of i
            mdrs[i] = getDS(i);
            for (int j = 0; j < f.size() / 2; ++j) {
                //2 factors of i
                int a = f.get(2*j);
                int b = f.get(2*j+1);
                //Either the sum of the maximum of the digital root sums of a and b are the min
                //or the digital root sum of i is the max
                mdrs[i] = Math.max(mdrs[i], mdrs[a] + mdrs[b]);
            }
            //increment min
            s += mdrs[i];
        }
        System.out.println(s);
    
   //Digital root sum
    public static int getDS(int n) {
        return n%9==0?9:n%9;
    }
}
