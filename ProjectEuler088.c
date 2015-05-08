#include <stdio.h>
int rec(int sum, int product, int k){
    if(sum <k)return 0;
    if(k==1&&sum==product)return 1;
    if(product==1&&sum==k)return 1;
    int i;
    for(i=2;i<=product&&(sum-i)>=k-1;++i)
        if(product%i==0&&rec(sum-i,product/i,k-1))return 1;
    return 0;
}
int main(){
    int i,j,sum=0;
    for(i=2;i<=12000;++i){
        for(j=i+1;!rec(j,j,i);++j);
        sum+=j;
    }
    printf("%d\n",sum);
    return 0;
}