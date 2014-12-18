public class ProjectEuler145 {
    public static void main(String[] args) {
        int c=120;
        int start=1000;
        int r = 0;
        int end = 1000000000;
        for(int i=start;i<end;++i){
            if(i%10 ==0)continue;
            String n = Integer.toString(i);
            if((n.charAt(0)-'0')%2==1&&(n.charAt(n.length()-1)-'0')%2==1)continue;
            int s = reverse(n);
            if(check(i,s))c++;
        }
        System.out.println(c);
    }
    public static boolean check(int n, int c){
        String a = Integer.toString(n+c);
        for(int i=0;i<a.length();++i){
            if(a.charAt(i)%2==0)return false;
        }
        return true;
    }
    public static int reverse(String n){
        String a = "";
        for(int i=n.length()-1;i>=0;--i)a+=n.charAt(i);
        return Integer.parseInt(a);
    }
}
