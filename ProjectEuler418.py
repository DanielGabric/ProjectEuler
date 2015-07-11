#not finished yet
from decimal import *
from math import *
getcontext().prec=200
primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43]
logs = [Decimal(log10(i)) for i in primes]

cache={}
N=43
A=1
C=1 
exponents = [0]*(len(primes))
exp =[0]*len(primes)
fact=1
for i in xrange(len(primes)):
    pj=primes[i]
    while pj <= N:
        exponents[i]+=N/pj
        pj*=primes[i]
    fact *= primes[i]**exponents[i]
sumOfLog = sum([logs[i]*exponents[i] for i in xrange(len(primes))])
print sumOfLog
curt = int(fact**(1.0/3.0))
print exponents
length = len(primes)
Fn=0
freqA = [0]*length
freqC = [0]*length
#make them into logs then add them for sum and subtract for RATIO
#make sure you have a frequency array
#backtracking
RATIO = Decimal(200)/Decimal(1)
def rec1(start):
    global RATIO
    global Fn
    global freqC
    global freqA
    global C

    while start <length and exp[start]==0:start+=1

    if start >= length: return False

    #print a," ",c
    if C <= int(1.01*curt) and C >= A:
        newRat = Decimal(C)/Decimal(A)
        if newRat < RATIO:
            bExp = [freqB[i]-freqA[i] for i in xrange(length)]
            b=1
            for i in xrange(length):
                b*=primes[i]**bExp[i]
            if A <= b and b <= C:
                Fn = A+b+C
                RATIO = newRat
        return True
    for i in xrange(exp[start]):
        freqC[start]+=1
        C*=primes[start]
        if rec1(c,a,exp,start+1,M): return True
        freqC[start]-=1
        C/=primes[start]
    return False


def rec(start):
    global freqA
    global A
    global exp
    if start >=length:return True
    print A," ",freqA
    if A>= int(0.99*curt):
        for i in xrange(length):
            exp[i]=exponents[i]-freqA[i]
        rec1(0)
        
    for i in xrange(exponents[start]):

        freqA[start]+=1
        A*=primes[start]
        if A<=curt and  rec(start+1): return True
        freqA[start]-=1
        A/=primes[start]
    return False
rec(0)
print Fn," ",RATIO