from Library import *
n=10000
primes = []
composite =[]
for i in xrange(2,n*100):
    if len(primes) == len(composite)==n:
        break
    if isPrime(i):
        if len(primes) < n:primes.append(i%9 if i%9!=0 else 9)
    else:
        if len(composite) < n:composite.append(i%9 if i%9!=0 else 9)
DP=[0]+[primes[0]]+[0]*(n-1)
Cd=[composite[0]]+[0]*(n-1)
for i in xrange(1,n):
    DP[i]=DP[i-1]*10+primes[i-1]
    Cd[i]=Cd[i-1]*10+composite[i-1]
for i in xrange(1,n+1):
    intermediate=[Cd[i-1]]+[0]*(n)
    for j in xrange(1,n+1):
        if composite[i-1]==primes[j-1]:intermediate[j] = DP[j-1]*10+composite[i-1]
        elif DP[j] >= intermediate[j-1]:intermediate[j]=10*DP[j]+composite[i-1]
        else:intermediate[j]=10*intermediate[j-1]+primes[j-1]
    DP= list(intermediate)
print DP[n-1]%1000000007



