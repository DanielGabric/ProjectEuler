from Library import * 
s=int(600851475143**0.5)
for i in xrange(s,1,-1):
    if 600851475143%i==0 and isPrime(i):
        print i
        break