def sieve(n):
    isPrime = [False]*2+[True]*(n-1)
    i=2
    while i*i<=n:
        j=i
        while i * j <=n:
            isPrime[i*j]=False
            j+=1
        i+=1
    return isPrime
def getPrimeList(n):
    isPrime = sieve(n)
    listPrimes = []
    for i in range(2, n+1):
        if isPrime[i]:listPrimes.append(i)

    return listPrimes

def powMod(a,b,c):
    if(b==1): return a%c
    x = powMod(a,b>>1,c)
    x = (x*x)%c
    if(b&1==1)==1: # if odd number
        x = (x*a)%c
    return x