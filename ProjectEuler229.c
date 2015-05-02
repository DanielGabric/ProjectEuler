#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define N 2000000000
int main()
{
    char* num = malloc(N+1);
    char *num1= malloc(N+1);
    char *num2= malloc(N+1);
    char *num3= malloc(N+1);
    memset(num,0,N+1);
    memset(num1,0,N+1);
    memset(num2,0,N+1);
    memset(num3,0,N+1);
    int a,b;
    for(a = 1; a<=44721;++a){
        for(b = 1;b <=44721;++b){
            int b1 = b*b;
            int a1 = a*a;
            long long int one = (long long int)a1+(long long int)b1;
            if(one > N)break;
            num[a1+b1]++;
            long long int two = (long long int)a1+2*(long long int)b1;
            if(two > N)continue;
            num1[a1+2*b1]++;
            long long int three = (long long int)a1+3*(long long int)b1;
            if(three > N)continue;
            num2[a1+3*b1]++;
            long long int four = (long long int)a1+7*(long long int)b1;
            if(four > N)continue;
            num3[a1+7*b1]++; 
        }
    }
    int sum=0,i=0;
    for(i=1;i<=N;++i)
        if(num[i]>=1&&num1[i]>=1&&num2[i]>=1&&num3[i]>=1)sum++;
    printf("%d\n",sum);
    free(num);
    free(num1);
    free(num2);
    free(num3);
    return 0;
}