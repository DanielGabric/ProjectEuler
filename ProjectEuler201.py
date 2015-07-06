M = (100*101*201)/6
DP = [[0 for i in xrange(51)]for i in xrange(M+1)]
for i in xrange(1,101):
    for j in xrange(M-i*i-1,-1,-1):
        for k in xrange(1,50):
            DP[j+i*i][k+1]+=DP[j][k]
            if DP[j+i*i][k+1]>1:DP[j+i*i][k+1]=2
    DP[i*i][1]+=1
print sum([i if DP[i][50]==1 else 0 for i in xrange(1,M+1)])