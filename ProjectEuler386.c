#include <stdio.h>
#include <stdlib.h>
#define N 100000000
int divPrime[N+1]={0};
int main(){
    int i,j,count=0,sum=0;
    int * exponents=malloc(sizeof(int)*(N+1));
    divPrime[0]=divPrime[1]=-111111;
    for(i=2;i<=N;++i)if(!divPrime[i])for(j=i;j<=N;j+=i)divPrime[j]=i;
    exponents[1]=0;
    for(i=2;i<=N;++i){
        exponents[i]=0;
        count = 0;
        int f=i;
        while(f > 1){
            f/= divPrime[f];
            count++;
        }
        if(count==1)sum++;
        exponents[i]=count;
    }
    for(i=2;i<=N/2;++i)for(j=2*i;j<=N;j+=i)if(exponents[i]==exponents[j]/2)sum++;
    printf("%d\n",sum+1);
    free(exponents);
    return 0;
}