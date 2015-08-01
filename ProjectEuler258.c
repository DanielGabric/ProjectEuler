#include <stdio.h>
#include <stdlib.h>
typedef long long int LONG;
LONG** mul(LONG **A,  LONG **B,LONG mod){
    LONG **C,i,j,k;
    C=malloc(sizeof(LONG*)*2000);
    for(i=0;i<2000;++i){
        C[i]=malloc(sizeof(LONG)*2000);
        for(j=0;j<2000;++j)C[i][j]=0;
    }
    for (i=0;i<2000;++i)
        for(j=0;j<2000;++j)
            for(k=0;k<2000;++k)
                C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % mod;
    return C;
}
LONG** pow1(LONG **A,  LONG p, LONG mod){
    if (p == 1)
        return A;
    if ((p % 2)==1)
        return mul(A, pow1(A, p-1,mod),mod);
    LONG **X = pow1(A, p/2,mod);
    return mul(X, X,mod);
}
int main(){
    LONG mod = 20092010;
    LONG p = 1000000000000000000LL;
    int i,j;
    LONG ** A=malloc(sizeof(LONG*)*2000);
    for(i=0;i<2000;++i){
        A[i]=malloc(sizeof(LONG)*2000);
        for(j=0;j<2000;++j)A[i][j]=0;
    }
    for(i=0;i<2000;++i)A[1999][i]=1;
    for(j=1,i=0;i<2000&&j<2000;j++,i++)A[i][j]=1;
    LONG ** B = pow1(A,p-1,mod);
    printf("%lld\n",B[0][0]);
    return 0;
}