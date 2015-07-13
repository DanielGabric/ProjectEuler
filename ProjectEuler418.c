#include <limits.h>
#include <stdio.h>
typedef long double LONG;
int main(){
    int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43};
    int exponents[]={39, 19, 9, 6, 3, 3, 2, 2, 1, 1, 1, 1, 1, 1};
    LONG two[]={1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648, 4294967296, 8589934592, 17179869184, 34359738368, 68719476736, 137438953472, 274877906944, 549755813888};
    LONG three[]={1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};
    LONG five[]={1, 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125};
    LONG seven[]={1, 7, 49, 343, 2401, 16807, 117649};
    LONG eleven[]={1, 11, 121, 1331};
    LONG thirteen[]={1, 13, 169, 2197};
    LONG seventeen[]={1, 17, 289};
    LONG nineteen[]={1, 19, 361};
    LONG twentythree[]={1, 23};
    LONG twentynine[]={1, 29};
    LONG thirtyone[]={1, 31};
    LONG thirtyseven[]={1, 37};
    LONG fortyone[]={1, 41};
    LONG fortythree[]={1, 43};
    LONG curt = 392387855098337600;
    LONG A =1;
    int count=0;
    int a,b,c,d,e,f,g,h,i,j,k,l,m,n,aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn;
    LONG aaa,bbb,ccc,Fn=200.00;
    printf("%Lf %Lf\n",0.9999*curt,1.0001*curt);
    for(a=0;a<=exponents[0];++a){
        printf("%d\n",a);
        A*=two[a];
        if (A>= curt){ 
            A/=two[a];
            break;
        }
        for(b=0;b<=exponents[1];++b){
            printf("%d\n",b);
            A*=three[b];
            if (A>=curt){ 
                A/=three[b];
                break;
            }
            for(c=0;c<=exponents[2];++c){ 
                printf("%d\n",c);
                A*=five[c];
                if (A>=curt){ 
                    A/=five[c];
                    break;
                }

                for(d=0;d<=exponents[3];++d){ 
                    A*=seven[d];
                    if (A>=curt){
                        A/=seven[d];
                        break;
                    }
                    for(e=0;e<=exponents[4];++e){ 

                        A*=eleven[e];
                        if (A==1 || A>=curt){
                            A/=eleven[e];
                            break;
                        }
                        for(f=0;f<=exponents[5];++f){
                            A*=thirteen[f];
                            if (A>=curt){
                                A/=thirteen[f];
                                break;
                            }
                            for(g=0;g<=exponents[6];++g){ 
                                A*=seventeen[g];
                                if (A>=curt){
                                    A/=seventeen[g];
                                    break;
                                }
                                for(h=0;h<=exponents[7];++h){
                                    A*=nineteen[h];
                                    if (A>=curt){
                                        A/=nineteen[h];
                                        break;
                                    }
                                    for(i=0;i<=exponents[8];++i){ 
                                        A*=twentythree[i];
                                        if (A>=curt){ 
                                            A/=twentythree[i];
                                            break;
                                        }
                                        for(j=0;j<=exponents[9];++j){
                                            A*=twentynine[j];
                                            if (A>=curt){
                                                A/=twentynine[j];
                                                break;
                                            }
                                            for(k=0;k<=exponents[10];++k){
                                                A*=thirtyone[k];
                                                if (A>=curt){
                                                    A/=thirtyone[k];
                                                    break;
                                                }
                                                for(l=0;l<=exponents[11];++l){
                                                    A*=thirtyseven[l];
                                                    if (A>=curt){
                                                        A/=thirtyseven[l];
                                                        break;
                                                    }
                                                    for(m=0;m<=exponents[12];++m){
                                                        A*=fortyone[m];
                                                        if (A>=curt){
                                                            A/=fortyone[m];
                                                            break;
                                                        }
                                                        for(n=0;n<=exponents[13];++n){
                                                            A*=fortythree[n];
                                                            if (A>=curt){
                                                                A/=fortythree[n];
                                                                break;
                                                            }
                                                            //printf("0\n");
                                                            if(A>=(long)(0.9999*A)){
                                                                
                                                                LONG C = 1;
                                                                    for(aa=0;aa<=exponents[0]-a;++aa){
                                                                       
                                                                        C*=two[aa];
                                                                        if (C>= 1.0001*curt){ 
                                                                            C/=two[aa];
                                                                            break;
                                                                        }
                                                                        for(bb=0;bb<=exponents[1]-b;++bb){
                                                                            C*=three[bb];
                                                                            if (C >= 1.01 *curt){
                                                                                C/=three[bb];
                                                                                break;
                                                                            }
                                                                            for(cc=0;cc<=exponents[2]-c;++cc){ 
                                                                                C*=five[cc];
                                                                                if (C>= 1.0001*curt){
                                                                                    C/=five[cc];
                                                                                    break;
                                                                                }

                                                                                for(dd=0;dd<=exponents[3]-d;++dd){ 
                                                                                    C*=seven[dd];
                                                                                    if (C>= 1.0001*curt){
                                                                                        C/=seven[dd];
                                                                                        break;
                                                                                    }
                                                                                    for(ee=0;ee<=exponents[4]-e;++ee){ 
                                                                                        C*=eleven[ee];
                                                                                        if (C==1 || C>= 1.0001*curt){
                                                                                            C/=eleven[ee];
                                                                                            break;
                                                                                        }
                                                                                        for(ff=0;ff<=exponents[5]-f;++ff){
                                                                                            C*=thirteen[ff];
                                                                                            if (C>= 1.0001*curt){
                                                                                                C/=thirteen[ff];
                                                                                                break;
                                                                                            }
                                                                                            for(gg=0;gg<=exponents[6]-g;++gg){ 
                                                                                                C*=seventeen[gg];
                                                                                                if (C>= 1.0001*curt){
                                                                                                    C/=seventeen[gg];
                                                                                                    break;
                                                                                                }
                                                                                                for(hh=0;hh<=exponents[7]-h;++hh){
                                                                                                    C*=nineteen[hh];
                                                                                                    if (C>= 1.0001*curt){
                                                                                                        C/=nineteen[hh];
                                                                                                        break;
                                                                                                    }
                                                                                                    for(ii=0;ii<=exponents[8]-i;++ii){ 
                                                                                                        C*=twentythree[ii];
                                                                                                        if (C>= 1.0001*curt){
                                                                                                            C/=twentythree[ii];
                                                                                                            break;
                                                                                                        }
                                                                                                        for(jj=0;jj<=exponents[9]-j;++jj){
                                                                                                            C*=twentynine[jj];
                                                                                                            if (C>= 1.0001*curt){
                                                                                                                C/=twentynine[jj];
                                                                                                                break;
                                                                                                            }
                                                                                                            for(kk=0;kk<=exponents[10]-k;++kk){
                                                                                                                C*=thirtyone[kk];
                                                                                                                if (C>= 1.0001*curt){
                                                                                                                    C/=thirtyone[kk];
                                                                                                                    break;
                                                                                                                }
                                                                                                                for(ll=0;ll<=exponents[11]-l;++ll){
                                                                                                                    C*=thirtyseven[ll];
                                                                                                                    if (C>= 1.0001*curt){
                                                                                                                        C/=thirtyseven[ll];
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    for(mm=0;mm<=exponents[12]-m;++mm){
                                                                                                                        C*=fortyone[mm];
                                                                                                                        if (C>= 1.0001*curt){
                                                                                                                            C/=fortyone[mm];
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        for(nn=0;nn<=exponents[13]-n;++nn){
                                                                                                                            C*=fortythree[nn];
                                                                                                                            if (C>= 1.01*curt){
                                                                                                                                C/=fortythree[nn];
                                                                                                                                break;
                                                                                                                            }
                                                                                                                           // printf("%Lf\n",C);
                                                                                                                            if(C<=(long)(1.0001*C) && C >= curt){
                                                                                                                                LONG newRatio = C/A;
                                                                                                                                //printf("%Lf\n",newRatio);
                                                                                                                                if(newRatio < Fn){
                                                                                                                                   
                                                                                                                                    LONG B = two[exponents[0]-a-aa]*three[exponents[1]-b-bb]*five[exponents[2]-c-cc]*seven[exponents[3]-d-dd]*eleven[exponents[4]-e-ee]*thirteen[exponents[5]-f-ff]*seventeen[exponents[6]-g-gg]*nineteen[exponents[7]-h-hh]*twentythree[exponents[8]-i-ii]*twentynine[exponents[9]-j-jj]*thirtyone[exponents[10]-i-ii]*thirtyseven[exponents[11]-k-kk]*fortyone[exponents[12]-m-mm]*fortythree[exponents[13]-n-nn];
                                                                                                                                    
                                                                                                                                    if( A <= B && B <= C){
                                                                                                                                        //
                                                                                                                                        Fn = newRatio;
                                                                                                                                        aaa=A;
                                                                                                                                        ccc=C;
                                                                                                                                        bbb = B;
                                                                                                                                    }
                                                                                                                                    

                                                                                                                                }

                                                                                                                            }
                                                                                                                            C/=fortythree[nn];
                                                                                                                        }
                                                                                                                        C/=fortyone[mm];
                                                                                                                    }
                                                                                                                    C/=thirtyseven[ll];
                                                                                                                }
                                                                                                                C/=thirtyone[kk];
                                                                                                            }
                                                                                                            C/=twentynine[jj];
                                                                                                        }
                                                                                                        C/=twentythree[ii];
                                                                                                    }
                                                                                                    C/=nineteen[hh];
                                                                                                }
                                                                                                C/=seventeen[gg];
                                                                                            }
                                                                                            C/=thirteen[ff];
                                                                                        }
                                                                                        C/=eleven[ee];
                                                                                    }
                                                                                    C/=seven[dd];
                                                                                }
                                                                                C/=five[cc];
                                                                            }
                                                                            C/=three[bb];
                                                                        }
                                                                        C/=two[aa];
                                                                    }

                                                            }
                                                            A/=fortythree[n];
                                                        }
                                                        A/=fortyone[m];
                                                    }
                                                    A/=thirtyseven[l];
                                                }
                                                A/=thirtyone[k];
                                            }
                                            A/=twentynine[j];
                                        }
                                        A/=twentythree[i];
                                    }
                                    A/=nineteen[h];
                                }
                                A/=seventeen[g];
                            }
                            A/=thirteen[f];
                        }
                        A/=eleven[e];
                    }
                    A/=seven[d];
                }
                A/=five[c];
            }
            A/=three[b];
        }
        A/=two[a];
    }
    printf("%Lf %Lf %Lf\n",aaa,bbb,ccc);
    return 0;
}
