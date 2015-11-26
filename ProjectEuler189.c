#include <stdio.h>
#define LIMIT 8
long long int ways[14348907][LIMIT+1]={0},sum=0;
int upper[20],lower[20],j;
int getLevel(int n){
    return 2*n-1;
}
void generate(int last, int c,int n){
    int i;
    if(c>=getLevel(n)){
        int upperBase3=0,lowerBase3=0,power3=1;
        for(i=getLevel(n)-1,power3=1;i>=0;--i,power3*=3)lowerBase3+=power3*lower[i];
        for(i=getLevel(n-1)-1,power3=1;i>=0;--i,power3*=3)upperBase3+=power3*upper[i];
        ways[lowerBase3][n]+=ways[upperBase3][n-1];
    }else{
        for(i=0;i<3;++i){
            if(last == i ||(c>0 && c%2==1 &&upper[c-1]==i))continue;
            lower[c]=i;
            generate(i,c+1,n);
        }
    }
}
void recurse(int last, int c, int n){
    int i;
    if(c>=getLevel(n-1))
        generate(-1,0,n);
    else{
        for(i=0;i<3;++i){
            if(last==i)continue;
            upper[c]=i;
            recurse(i,c+1,n);
        }
    }
}
int main(){
    ways[0][1]=ways[1][1]=ways[2][1]=1;
    for(j=2;j<=LIMIT;++j)recurse(-1,0,j);
    for(j=0;j<14348907;++j)sum+=ways[j][LIMIT];
    printf("%lld\n",sum);
    return 0;
}