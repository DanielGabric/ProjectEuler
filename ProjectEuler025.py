fib=[1 for i in xrange(10000)]
for i in xrange(3,10000):
    fib[i]=fib[i-1]+fib[i-2]
    if len(str(fib[i]))==1000:
        print i
        break