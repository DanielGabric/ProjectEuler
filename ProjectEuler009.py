import math
for i in xrange(1,1000):
    for j in xrange(i,1000):
        if int((i**2+j**2)**0.5)==int(math.ceil((i**2+j**2)**0.5)):
            if i+j+int((i**2+j**2)**0.5)==1000:
                print i*j*int((i**2+j**2)**0.5)
                break