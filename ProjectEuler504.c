#include <stdio.h>
#include <math.h>
#define M 100
typedef long long int L;
L gcd(L x, L y) {
    while (y != 0) {
        L z = x % y;
        x = y;
        y = z;
    }
    return x;
}
L isSquare(L something){
    L f = (L)sqrt(something);
    if(f*f==something)return 1;
    else return 0;
}
int main(){
    L a,b,c,d,sum=0;
    for(a=1;a<=M;++a)
        for(b=1;b<=M;++b)
            for(c=1;c<=M;++c)
                for(d=1;d<=M;++d)
                    if(isSquare(((a+c)*(b+d)-gcd(a,b)-gcd(b,c)-gcd(c,d)-gcd(d,a))/2+1))
                        sum ++;
    printf("%lli\n",sum);
    return 0; 
}