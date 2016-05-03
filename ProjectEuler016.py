sum=0
s=2**1000
while s>0:
    sum+=s%10
    s/=10
print sum