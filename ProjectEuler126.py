def getLayer(a,b,c,n):
    return 2*(a*b+b*c+a*c)+4*(n-1)*(a+b+c)+4*(n-1)*(n-2)
C=[0]*20001
a,b,c,n=1,0,0,1
while getLayer(a,a,a,1)<=20000:
    b=a
    while getLayer(a,a,b,1)<=20000:
        c=b
        while getLayer(a,b,c,1) <= 20000:
            n=1
            while getLayer(a,b,c,n)<=20000:
                C[getLayer(a,b,c,n)]+=1
                n+=1
            c+=1
        b+=1
    a+=1
for i in range(1,20001):
    if C[i]==1000:
        print i 
        break