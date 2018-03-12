import numpy
import math
fullarea = ((4-3.141592654)/4)

def sqrt(x):
    return x**0.5
def arcsin(x):
    return numpy.arcsin(x)

for n in xrange(1, 100000):
    a = 1.0/n
    A=a
    firstTerm= A/2 * ((A-sqrt(2*A)+1)/(A**2+1))**2
    secondTerm=(A**2-A+sqrt(2*A))/(A**2+1)
    thirdTerm=arcsin((a**2-a+sqrt(2)*sqrt(a))/(a**2+1))/2+((sqrt(2)*a**2-sqrt(2)*a+2*sqrt(a))*sqrt(2*(a**3)+(a**2)-(2**(3.0/2.0))*(a-1)*(a**(3.0/2.0))-2*a+1))/((2**(3.0/2.0))*((a**2)+1)**2)
    if ( (firstTerm+secondTerm-thirdTerm))/fullarea <= 0.001:
        print n
        break