cache = {}
def sumD(n):
    sum=0
    while n > 0:
      sum += n % 10
      n /= 10
    return sum
def recurse(n, r1, r2):
    if (n, r1, r2) in cache: 
        return cache[(n, r1, r2)]
    total=0  
    if n == 17:
        for i in xrange(0, 10):
            if sumD(137*i+r1)==sumD(i)+r2:
                total+=1
    else:
        for i in xrange(0, 10):
            total += recurse(n + 1, (137 * i + r1) / 10, i - (137 * i + r1) % 10 + r2)
        cache[(n, r1, r2)] = total
    return total

print recurse(0, 0, 0)