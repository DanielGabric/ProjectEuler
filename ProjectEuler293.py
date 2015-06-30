import Library
LIM=10**9
primes = Library.getPrimeList(int(LIM**0.5)+100)
length = len(primes)
tot =[]
def M (N,s):
    while not Library.miller_rabin(N,6):N+=2
    return N-s
def gen(N,i):
    if i < length-1 and N*primes[i+1]<LIM:
        start = N*primes[i+1]
        tot.append(M(start+3,start))
        gen(start,i+1)
    if i<length and N*primes[i]<LIM:
        start = N*primes[i]    
        tot.append(M(start+3,start))
        gen(start,i)
gen(2,0)
print sum(set(tot))

