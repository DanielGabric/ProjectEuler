from math import ceil
from decimal import Decimal
A='1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679'
B='8214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196'
gold = Decimal((5**0.5+1.0)/2.0)
sum=0
for i in xrange(18):
    start = (127+19*i)*7**i-1
    remainder,quotient = start%100,start/100
    if int((quotient-1)*gold)==int(quotient*gold)-1:sum+=10**i*(ord(A[remainder])-ord('0'))
    else:sum+=10**i*(ord(B[remainder])-ord('0'))
print sum+3