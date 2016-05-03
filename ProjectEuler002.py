fib = [0,1]
r=[]
while fib[len(fib)-1]<=4000000:
    fib.append(fib[len(fib)-1]+fib[len(fib)-2])
    if fib[len(fib)-1]%2==0:r.append(fib[len(fib)-1])
print sum(r)