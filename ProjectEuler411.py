from math import ceil
sum=0
for k in xrange(1,31):
    n = k**5
    m=set()
    for i in xrange(0,2*n+1):
        tup = (pow(2,i,n),pow(3,i,n))
        if tup in m:break
        else: m.add(tup)
    #sort with respect to first var
    f = sorted(list(m))
    y = [i[1] for i in f]
    #LCI FROM WIKIPEDIA
    N = len(y)
    P = [0 for i in xrange(N)]
    M = [0 for i in xrange(N+1)]
    L=0
    for i in xrange(N):
        lo = 1
        hi = L
        while lo <= hi:
            mid = int(ceil((lo+hi)/2.0))
            if y[M[mid]]<=y[i]:
                lo = mid+1
            else:
                hi = mid-1
        newL = lo
        P[i]=M[newL-1]
        M[newL]=i
        if newL > L:
            L = newL
    sum+= L
print sum