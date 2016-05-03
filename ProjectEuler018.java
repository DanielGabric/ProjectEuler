import java.io.*;
import java.util.*;
public class ProjectEuler018 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("p018_triangle.txt"));
        int[][]triangle = new int[16][16];
        for(int i=0;i<15;++i)
            for(int j=0;j<=i;++j)
                triangle[i][j]=s.nextInt();
        for(int i=14;i>=0;--i)
            for(int j=0;j<=i;++j)
                triangle[i][j]+=Math.max(triangle[i+1][j], triangle[i+1][j+1]);
        System.out.println(triangle[0][0]);
    }
}
 