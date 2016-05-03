#include <stdio.h>
#define N 100000000
typedef long long int LONG;
int divPrime[N+1]={0};


void populatePrimes(){
    int i,j,f;
    divPrime[0]=divPrime[1]=-111111;
    for(i=2;i<=N;++i)if(!divPrime[i])for(j=i;j<=N;j+=i)divPrime[j]=i;
}

int main(){
    populatePrimes();
    int i,j,count=0,current;
    LONG sum=0;
    for(i=2;i<=N;++i){
        count=0;
        current=i;
        int max=-1,save1=0,save2=0,save3=0,currentOne=1;
        while(current>1){
            count=0;
            currentOne=1;
            save1=divPrime[current];
            while(current%save1==0){
                current/=save1;
                count++;
                currentOne*=save1;
            }
            int f = 0,r = 1,multiplier =1;
            while((f+=r)<count)r*=save1;
            f-=r;
            for(j=r;j<=r*save1;j+=save1){
                int s = j,ss=0;
                while(s>1){
                    ss+=s/save1;
                    s/=save1;
                }
                if(ss>=count){
                    multiplier=j/save1;
                    break;
                }
            }
            if(multiplier*save1>max){
                max = save1*multiplier;
                save2=multiplier;
                save3=save1;
            }
        }
        
        sum+=save3*save2;
    }
    printf("%lld\n",sum);
    return 0;
}
