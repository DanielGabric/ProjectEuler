#include <stdio.h>
int main(){
    int div2[200001],div5[200001],j,k,c=0,some,i;
    for(i=0;i<=200000;++i){
        int two = 2;
        int five = 5,sum=0;
        while (two <=i){
            sum+=i/two;
            two*=2;
        }
        div2[i]=sum;
        sum=0;
        while(five <=i){
            sum+=i/five;
            five*=5;
        }
        div5[i]=sum;
    }
    for(i=0;i<=66666;++i){
        if(i%2==0){
            j = (200000-i)/2;
            if((div2[200000]-div2[i]-2*div2[j])>=12 &&(div5[200000]-div5[i]-2*div5[j])>=12)
                //adding all combinations, so 3!/2!
                c+=3;
        }
        k = 200000-2*i;
        if ((div2[200000]-2*div2[i]-div2[k])>=12 && (div5[200000]-2*div5[i]-div5[k])>=12)
            //adding all combinations, 3!/2!
            c+=3;
        for(some = 1; (200000-3*i)>some*2;++some){
            j = some+i;
            k = 200000-j-i;
            if ((div2[200000]-div2[i]-div2[j]-div2[k])>=12 && (div5[200000]-div5[i]-div5[j]-div5[k])>=12)
                //adding all combinations 3!
                c+=6;
        }
    }
    printf("%d\n",c);
    return 0;
}