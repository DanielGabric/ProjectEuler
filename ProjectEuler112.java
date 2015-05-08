public class ProjectEuler112 {
    public static void main(String[] args) {
        double bounce = 0;
        for(int i=101;true;++i){
            String n = Integer.toString(i);
            int bigger=0,smaller =0;
            for(int x=0;x<n.length()-1;++x){
                if(n.charAt(x)<n.charAt(x+1))
                    smaller++;
                else if (n.charAt(x)>n.charAt(x+1))
                    bigger++;            }
            if(smaller > 0 && bigger > 0)
                bounce ++; 
            if(bounce/i == 0.99){
                System.out.println(i);
                break;
            }
        }
    }
}
