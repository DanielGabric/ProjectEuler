import java.util.*;
import java.math.*;
public class ProjectEuler178{
    static int MAX = 40;
    static int START = 10;
    //static HashMap <String,Long> map = new HashMap<String,Long>(); 
    public static void main(String[]args){
        long sum =0;
        for(int i=START;i<=MAX;++i){
            for(int firstdigit=1;firstdigit<=9;++firstdigit){
                sum += recurse(i,firstdigit,1023);
            }
        }
        System.out.println(sum);
    }
    public static long recurse(int num_digits, int current_digit, int allDigits){
        long sum =0;
        int binaryRep = 1 << (current_digit);
        String s = "";
        
        if(num_digits==1){
            if(allDigits==0||binaryRep == allDigits)return 1;
            else return 0;
        }
        String hash = num_digits+""+current_digit+""+allDigits;
        if(map.containsKey(hash))return map.get(hash);
        int result = allDigits & binaryRep;
        if(result != 0)allDigits-= binaryRep;
        if(current_digit > 0){
            sum += recurse(num_digits-1,current_digit-1,allDigits);
        }
        if(current_digit < 9){
            sum += recurse(num_digits-1,current_digit+1,allDigits);
        }
        map.put(hash,sum);
        return sum;
    }
}