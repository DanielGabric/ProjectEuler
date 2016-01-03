#include <stdio.h>
#include <stdlib.h>
#define LONG long long int 
#define N 100000000
#define NUM_PRIMES 5761455
int divPrime[N+1]={0},primeCount=0, primeList[NUM_PRIMES], numberOfPFacts=0,aCount=0,b,exponents[32],primes[1000];
LONG allA[N],backtrack=1;

void populatePrimes(){
    int i,j,f;
    divPrime[0]=divPrime[1]=-111111;
    for(i=2;i<=N;++i)
        if(!divPrime[i]){
            primeList[primeCount++]=i;
            for(j=i;j<=N;j+=i)
                divPrime[j]=i;
        }
}

void generateA(int i, LONG backtrack){
    if(i>=numberOfPFacts){
        if(backtrack>=1ll*b || backtrack==1ll)return;
        allA[aCount++]=backtrack;
    }else{
        int j;
        for(j=0;j<=exponents[i];++j){
            generateA(i+1,backtrack);
            backtrack *= primes[i];
        }
    }
}

void factorize(int toFact){
    int f=toFact;
    for(numberOfPFacts=0;f>1;++numberOfPFacts){
        int p = divPrime[f];
        primes[numberOfPFacts]=p;
        exponents[numberOfPFacts]=0;
        for(;divPrime[f]==p;exponents[numberOfPFacts]++,f/=p);
        exponents[numberOfPFacts]*=2;
    }
}

int main(){
    populatePrimes();
    int i,j;
    LONG total=0;
    for(i=0;i<primeCount;++i){
        b = primeList[i]+1;
        numberOfPFacts=0;
        aCount=0;
        backtrack=1;
        factorize(b);
        generateA(0,1);
        for(j=0;j<aCount;++j){
            LONG a = allA[j];
            LONG c = (1ll*b*b)/a;
            if(c>N)continue;
            if(divPrime[(int)(a-1)]==(int)(a-1)&&divPrime[(int)(c-1)]==(int)(c-1))           
                total+=a+b+c-3;
        }
    }
    printf("%lld\n",total);
    return 0;
}