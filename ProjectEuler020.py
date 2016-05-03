l=1
for i in xrange(2,101):l*=i
sum=0
while l>0:
    sum+=l%10;
    l/=10
print sum