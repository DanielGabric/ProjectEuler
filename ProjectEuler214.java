public class ProjectEuler214 {
    public static void main(String[] args) {
        long N = 40000000;
        long[]t = Library.listTotients(N);
        int[]l=new int[(int)N+1];
        long sum = 0;
        l[0]=0;
        out:for(int start=1;start<=N;++start){
            l[start]=l[(int)t[start]]+1;
            if(l[start]==25&&t[start]+1==start)sum+=start;
        }
        System.out.println(sum);
    } 
}
