#include <stdio.h>

typedef long long int LONG;

int main(){
    LONG c=1;
    int i;
    for(i=1;i<=60;++i)c*=2;
    c--;
    LONG counter=1;
    LONG total=0;

    for(;counter*counter <= c+1;++counter){
        if(c%counter==0){
            int flag1=0,flag2=0;
            LONG exp=1;
            for(i=1;i<=59;++i){
                exp*=2;
                if((exp-1)%counter==0)flag2=1;
                if((exp-1)%(c/counter)==0)flag1=1;
            }
            if(!flag1)
            total+=c/counter+1;
            if(!flag2)
            total+=counter+1;
        }
    }
    printf("%lld\n",total);
    return 0;
}