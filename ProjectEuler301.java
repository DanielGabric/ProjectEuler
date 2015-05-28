public class ProjectEuler301 {
    public static void main(String[] args) {
        long fib=0,fib1=0,fib2=1;
        for(int i=0;i<=30;++i){
            fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;
        }
        System.out.println(fib);
    }
}
