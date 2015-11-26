DP = [[0 for i in xrange(100)]for i in xrange(21)]
for i in xrange(100,1000):
    if i%10+(i/10)%10+(i/100)>=9:
        DP[3][i%100]+=1
for i in xrange(4,21):
    for j in xrange(0,100):
        s=j%10+(j/10)
        
        for k in xrange(0,10):
            if s+k >= 9:
                DP[i][(j%10)*10+k]+=DP[i-1][j]
print sum(DP[7])