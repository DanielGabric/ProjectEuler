import math
import random 
#mul and pow are for q-matrix
def mul( A,  B,mod):
    C = [[0 for i in xrange(len(B[0]))]for i in xrange(len(A))]
    for i in xrange(0,len(A)):
        for j in xrange(0,len(B[0])):
            for k in xrange(0,len(B)):
                C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % mod
    return C
def pow(A,  p,mod):
    if p == 1:
        return A
    if (p % 2)==1: 
        return mul(A, pow(A, p-1,mod),mod)
    X = pow(A, p/2,mod)
    return mul(X, X,mod)
def phi(n): 
    totients = []
    for i in xrange(0,n+1):
        totients.append(i)
    for i in xrange(2,n+1):
        if totients[i] == i:  
            for j in xrange(i,n+1,i):
                totients[j] = totients[j] / i * (i - 1)
            
    return totients;
def miller_rabin(m, k):
    s=1
    t = (m-1)/2
    while t%2 == 0:
        t /= 2
        s += 1

    for r in range(0,k):
        rand_num = random.randint(1,m-1)
        y = pow(rand_num, t, m)
        prime = False

        if (y == 1):
            prime = True


        for i in range(0,s):
            if (y == m-1):
                prime = True
                break
            else:
                y = (y*y)%m

        if not prime:
            return False

    return True
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
def isPrime(n):
    if n <= 1:
        return False
    if n == 2: 
        return True
    if n % 2 == 0:
        return False
    if n < 9 :
        return True
    if n % 3 == 0:
        return False
    counter = 5
    while (counter * counter) <= n:
        if n % counter == 0:
            return False
        if n % (counter + 2) == 0: 
            return False    
        counter += 6 
    return True
def gcd(x, y):
    while y != 0 :
        z = x % y
        x = y
        y = z
        
    return x
    