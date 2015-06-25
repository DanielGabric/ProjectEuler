import Library
N = 10**14
MOD = 1234567891011
isPrime = Library.sieve(int(N**0.5))
isPrimeBig = [True for i in xrange(0,3300001)]
for i in xrange(2,10000000):
    if not isPrime[i]:continue
    for j in xrange(i*i,10000000,i):
        isPrime[j]=False
    k = ((N-1)/i+1)*i-N
    for m in xrange(k,3300001,i):
        isPrimeBig[m]=False
def mul( A,  B):
    C = [[0 for i in xrange(3)]for i in xrange(3)]
    for i in xrange(1,3):
        for j in xrange(1,3):
            for k in xrange(1,3):
                C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD
    return C
def pow(A,  p):
    if p == 1:
        return A
    if (p % 2)==1:
        return mul(A, pow(A, p-1))
    X = pow(A, p/2)
    return mul(X, X)
F = [0,1,1]
T = [[0 for i in xrange(3)]for i in xrange(3)]
T[1][1]=0
T[1][2]=1
T[2][1]=1
T[2][2]=1
sums=0
counter=0
index=0
for i in xrange(0,3300001):
    if isPrimeBig[i]:counter+=1
    if counter == 100000: 
        index = i
        break
for i in xrange(1,index+1):
    if not isPrimeBig[i]:continue
    bigPow = N+i
    M = pow(T,bigPow-1)
    for j in xrange(1,3):
        sums = (sums + M[1][j]) % MOD
print sums