public class ProjectEuler112 {
    public static void main(String[] args) {
        int nonBounce = 100;
        double bounce = 0;
        for(int i=101;true;++i){
            String n = Integer.toString(i);
            int bigger=0;
            int smaller =0;
            int same =0;
            for(int x=0;x<n.length()-1;++x){
                if(n.charAt(x)<n.charAt(x+1))
                    smaller++;
                else if (n.charAt(x)>n.charAt(x+1))
                    bigger++;
                else 
                    same++;
            }
            if(smaller > 0 && bigger > 0)
                bounce ++; 
            else 
                nonBounce++;
            if(bounce/i == 0.99){
                System.out.println(i);
                break;
            }
        }
    }
}
