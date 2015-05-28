#include <stdio.h>
typedef long long int LONG;
int main(){
    LONG start = 1010101010,end = 1389026623,i,check[10] = {0,9,8,7,6,5,4,3,2,1};
    for(i=start;i<=end;){
        LONG result = i*i,j=0;
        while(result>0){
            if(result % 10 != check[j])
                goto out;
            result /=100;
            j++;
        }
        printf("%lli\n",i);
        break;
        out:
        i++;
    }
    return 0;
} 