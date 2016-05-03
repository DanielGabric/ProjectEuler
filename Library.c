#include "Library.h"

void sieve(int primes[],int N){
    int i,j;
    primes[0]=primes[1]=-1;
    for(i=2;i<N;++i)primes[i]=1;
    for(i=2;i<=N;++i)if(primes[i])for(j=i;j<=N;j+=i)primes[i]=0;
}