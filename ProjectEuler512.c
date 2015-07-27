#include <stdio.h>
#include <stdlib.h>
typedef long long int LONG;
#define LIMIT 500000000
int* listTotients(int n) {
    int * totients = malloc(sizeof(int)*(n+1)),i,j;
    for (i = 0; i <= n; i++) totients[i] = i;
    for (i = 2; i <= n; i++)
        if (totients[i] == i) 
            for (j = i; j <= n; j += i) 
                totients[j] = totients[j] / i * (i - 1);
    return totients;
}
int main(){
    int*phi = listTotients(LIMIT),i;
    LONG sum=0;
    for(i=1;i<=LIMIT;i+=2)sum+=phi[i];
    printf("%lld\n",sum);
    free(phi);
    return 0;
}