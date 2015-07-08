n=2
m=9
def rec(N,tot,matrix):
    sums=0
    if tot==n*m:return 1
    s=[N,tot]
    for i in xrange(n):
        if matrix[N][i]==False:
            s.append(i)
    key = tuple(s)
    if key in cache:
        return cache[key]
    for i in xrange(n):
        if matrix[N][i]==True:continue
        #check all combinations here

    cache[key]=sums
    return sums

