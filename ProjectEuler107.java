//Prim's Algorithm made me happy
import java.util.*;
import java.io.*;
public class ProjectEuler107 {
    static int col, network[][],dist[],next[];
    static boolean v[];
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("network.txt"));
        col = 40;
        int sum =0;
        network = new int[col][col];
        for (int i = 0; i < col; ++i) {
            String n[] = s.nextLine().split(",");
            for (int j = 0; j < col; ++j) {
                if (n[j].equals("-")) {
                    network[i][j] = 0;
                    continue;
                }
                network[i][j] = Integer.parseInt(n[j]);
            }
        }
        for(int i=0;i<col;++i)for(int j=0;j<col;++j)sum+=network[i][j];
        int total = prim(0);
        System.out.println(sum/2-total);
    }

    static void n(int target) {
        for (int i = 0; i < col; ++i) 
            if ((network[target][i] != 0) && (dist[i] > network[target][i])) {
                dist[i] = network[target][i];
                next[i] = target;
            }
    }
    public static int prim(int A) {
        v = new boolean[40];
        next = new int[40];
        dist = new int[40];
        for (int i = 0; i < col; ++i)dist[i] = 100000;
        for (int i = 0; i < col; ++i)v[i] = false;
        v[A] = true;
        n(A);
        int t = 0;
        int treeSize;
        for (treeSize = 1; treeSize < col; ++treeSize) {
            int m = -1;
            for (int i = 0; i < col; ++i) {
                if (!v[i])if (m == -1 || dist[m] > dist[i])m = i;
            }
            v[m] = true;
            t += dist[m];
            n(m);
        } 
        return t;
    }
}
