fib = [1]+[1]+[2]+[0]*85
total = [1]+[1]+[2]+[0]*90
for i in xrange(3,85):
    fib[i]=fib[i-1]+fib[i-2]
    total[i]=total[i-1]+total[i-2]+fib[i-2]-1


def recurse(n):
    if n <= 2: 
        return total[n]
    else:
        current =0
        for i in xrange(0,85): 
            if fib[i]<=n:
                current= i
        return total[current]+n-fib[current]+recurse(n-fib[current])

print recurse(10**17-1)