public class ProjectEuler173 {
    public static void main(String[] args) {
        int limit = 1000000;
        int c = 0;
        out:for(int i=1;i<=limit;++i){
            int sum =0;
            for(int j=i+2;;j+=2){
                sum+=4*j-4;
                if(sum>limit)continue out;
                c++;
            } 
        }
        System.out.println(c);
    }
}
