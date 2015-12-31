import math

primes = [5, 13, 17, 29, 37, 41, 53, 61, 73, 89, 97, 101, 109, 113, 137, 149]
counter=0
def generateN(i,N):
    global counter
    if i>=len(primes) :
        if N!=1:
           print int(math.sqrt(N/2)) 
    else:
        generateN(i+1,N)
        generateN(i+1,N*primes[i])
generateN(0,1)


print counter