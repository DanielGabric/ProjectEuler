dp = [[0 for i in xrange(41)] for i in xrange(61)]
dp[0][0]=1
for i in xrange(61):
    for j in xrange(41):
        if i>0 or j>0:
            for k in xrange(61):
                for l in xrange(41):
                    if k+i >60 or l+j>40:break
                    dp[k+i][l+j]+=dp[k][l]
print dp[60][40]