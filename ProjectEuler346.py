N = 10**12
cache=[]
savedRep={}
#we know that 2^40 is over N, so our upper bound on lengths of repunits is 39
for base in range(2,10**6+1):
    for length in range(3,40):
        if length not in savedRep:
            savedRep[length] = (10**length-1)/9
        num = 0
        start = 1
        rep = savedRep[length]
        while rep >0:
            num += (rep%10)*start
            start*=base
            rep/=10
        if num > N: break
        cache.append(num)
print sum(set(cache))+1


