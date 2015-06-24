import Library
#we know that for this range
#the max length of a partition is probably around 4
#so we can just generate all of the different
#partitions and check them
LIMIT = 10**6
sieve = [0 for i in xrange(LIMIT+1)]
def rec(tot,pow2,pow3,mPow2,mPow3):
    a=pow2
    while a <= mPow2:
        b = pow3
        while b <= mPow3:
            subSum = tot+b*a
            if subSum < LIMIT:
                sieve[subSum]+=1
            c=pow2
            while c < a:
                d = pow3
                while d < b:
                    subSum= tot+a*d+c*b
                    if LIMIT <= subSum:break
                    sieve[subSum]+=1
                    rec(subSum,c*2,d*3,a//2,b//3)
                    d*=3
                c*=2
            b*=3
        a*=2

rec(0,1,1,LIMIT,LIMIT)
primes = Library.getPrimeList(LIMIT)
print sum([i if sieve[i]==1 else 0 for i in primes])
