from Library import *
m=1
for i in xrange(2,21):
    m=m*i/gcd(i,m)
print m