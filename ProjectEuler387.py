import Library
lim = 14
def rec(N,tot,number,isG=False):
    sums=0
    for i in xrange(0,10):
        num = number*10+i
        if isG and Library.miller_rabin(num,10):
            sums+=num
        if num % (tot+i)!=0:continue
        div = num/(tot+i)     
        if N < lim-1:
            if N !=1:
                if Library.miller_rabin(div,10):
                    sums+=rec(N+1,tot+i,num,True)
                else:
                    sums+=rec(N+1,tot+i,num)
            else:
                sums+=rec(N+1,tot+i,num) 
    return sums 
total=sum([181,211,271,277,421,457,631])
for i in xrange(1,10):
    total+=rec(1,i,i)
print total