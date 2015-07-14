#include <stdio.h>
#include <stdlib.h>
#define LIMIT 7
typedef long long int LONG;
int power(int a,int b){
    if(b==1) return a;
    int x = power(a,b>>1);
    x = (x*x);
    if((b&1==1)==1)x = (x*a);
    return x;
}
int getLevel(int n){
    return 2*n+1;
}
int main(){
    LONG **F=malloc(sizeof(LONG*)*(LIMIT+1)),sum=0;
    int i,j,k,x;
    int totLimit = power(3,15);
    for(i=0;i<=LIMIT;++i){
        F[i]=malloc(sizeof(LONG)*(totLimit+1));
        for(j=0;j<=totLimit;++j)
            F[i][j]=0;
    }
    F[0][0]=F[0][1]=F[0][2]=1;
    int currentRow[15]={0};
    int rowBefore[15]={0};
    for(i=1;i<=LIMIT;++i){
        int depth=getLevel(i);
        int depth1 = getLevel(i-1);
        int firstLimit = power(3,depth);
        int secondLimit = power(3,depth1);
        for(j=0;j<secondLimit;++j){
            if(F[i-1][j]==0)continue;
            int flag=0;
            int N = j;
            for(x=0;x<depth1;++x){
                rowBefore[x]=N%3;
                N/=3;
            }
            for(k=0;k<firstLimit;++k){
                flag=0;
                int R = k;
                for(x=0;x<depth;++x){
                    currentRow[x]=R%3;
                    if(x>0){
                        if((currentRow[x]==currentRow[x-1])||(x%2==1 &&rowBefore[x-1]==currentRow[x])){
                            flag=1;
                            break;
                        }
                    }
                    R/=3;
                }
                if(flag)continue;
                F[i][k]+=F[i-1][j];
            }
        }
    }
    for(i=0;i<=totLimit;++i)
        sum+=F[LIMIT][i];
    printf("%lld\n",sum);
    for(i=0;i<=LIMIT;++i)
        free(F[i]);
    free(F);
    return 0;
}