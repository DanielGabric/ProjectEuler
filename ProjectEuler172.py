###########DP solution############
cache={}
def rec(A=[0,0,0,0,0,0,0,0,0,0]):
    sums=0
    if sum(A)==18:
        return 1
    key = tuple(A)
    if key in cache:
        return cache[key]
    for i in xrange(10):
        if sum(A)==0 and i==0:continue
        if A[i] == 3:continue
        M = list(A)
        M[i]+=1
        sums+=rec(M)
    cache[key]=sums
    return sums
print rec()
##################################

###counting###
n=0
def factorial(n):return reduce(lambda x,y:x*y,[1]+range(1,n+1))
def z(a,s):
    if s != 18:
        return 0
    m=0
    if a[0] == 0:
        m = 18
    else:
        m = 18-a[0]
    m = m*factorial(17)
    for i in range(10):
        m /= factorial(a[i])
    return m
for a in range(4):
    for b in range(4):
        for c in range(4):
            for d in range(4):
                for e in range(4):
                    for f in range(4):
                        for g in range(4):
                            for h in range(4):
                                for i in range(4):
                                    for j in range(4):
                                        array = [a,b,c,d,e,f,g,h,i,j] 
                                        n+=z(array,sum(array))
print n
##########