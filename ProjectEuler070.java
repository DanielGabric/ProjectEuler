public class ProjectEuler70 {
    public static void main(String[] args) {
       long limit = Library.pow(10, 7);
       long[]totient = Library.listTotients(limit);
       double min = Integer.MAX_VALUE;
       int n = 0;
       int phiN = 0;
       out:for(int i=2;i<limit;++i){
            if(!isPerm(i,totient[i]))continue out;
            double ni = i;
            double phi = totient[i];
            double a = ni/phi;
            if(a<min){
                min = a; 
                n = i;
            }
        }
       System.out.println(n);
    }
    public static boolean isPerm(int n, long m){
        String a = Integer.toString(n);
        String b = Long.toString(m);
        if(a.length()!=b.length())return false;
        int []one = new int[10];
        int []two = new int[10];
        for(int i=0;i<a.length();++i){
            one[a.charAt(i)-'0']++;
            two[b.charAt(i)-'0']++;
        }
        for(int i=0;i<one.length;++i){
            if(one[i]!=two[i])return false;
        }
        return true;
    }
}
 