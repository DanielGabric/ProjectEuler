import Library
primes = Library.getPrimeList(5000)
tot=0
for p in range(0,len(primes)):
    for q in range(p+1,len(primes)):
        for r in range(q+1,len(primes)):
            tot+=2*primes[p]*primes[q]*primes[r]-primes[p]*primes[q]-primes[q]*primes[r]-primes[r]*primes[p]
print tot
