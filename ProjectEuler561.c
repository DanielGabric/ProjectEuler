#include <stdio.h>
typedef long long int LONG;
int main(){
    LONG n = 1000000000000ll/2,m=904961,sum=0,power=1;
    while(n>=power)sum+=n/(power*=2);
    printf("%lld\n",sum*(m+1));
    return 0;
}