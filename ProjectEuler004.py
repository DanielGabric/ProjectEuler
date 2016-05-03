max=0
for i in xrange(100,1000):
    for j in xrange(i,1000):
        if str(i*j)==str(i*j)[::-1] and i*j > max:
            max = i*j
print max