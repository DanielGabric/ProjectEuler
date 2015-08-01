from Library import isPrime
primes =[]
for i in xrange(2*10**9+1,2*10**9+2000,2):
    if isPrime(i):
        primes.append(i)
#Failhabers formula 