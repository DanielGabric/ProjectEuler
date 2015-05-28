import java.io.*;
import java.util.*;
public class ProjectEuler67 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("p067_triangle.txt"));
        int[][]triangle = new int[100][100];
        for(int i=0;i<100;++i)
            for(int j=0;j<=i;++j)
                triangle[i][j]=s.nextInt();
        for(int i=98;i>=0;--i)
            for(int j=0;j<=i;++j)
                triangle[i][j]+=Math.max(triangle[i+1][j], triangle[i+1][j+1]);
        System.out.println(triangle[0][0]);
    }
}
 