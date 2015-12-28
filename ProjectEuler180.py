import Libraryimport Library
k = 35
frac=[]
sums=[]
u = [0,1]
def returnTup(numerator,denominator):
    g = Library.gcd(numerator,denominator)
    numerator/=g
    denominator/=g
    z=(numerator,denominator)
    if z in frac:return z
    else:return (0,0)

def s(x,y,z):
    numerator = x[0]*y[1]*z[1]+x[1]*y[0]*z[1]+x[1]*y[1]*z[0]
    denominator = x[1]*y[1]*z[1]
    g = Library.gcd(numerator,denominator)
    numerator/=g
    denominator/=g
    return (numerator, denominator)

def add(value):
    if value not in sums:
        sums.append(value)
        newNum = value[0]*u[1]+u[0]*value[1]
        newDen = u[1]*value[1]
        g = Library.gcd(newNum,newDen)
        newNum /=g
        newDen /=g
        u[0]=newNum
        u[1]=newDen

for a in xrange(1,k):
    for b in xrange(a+1,k+1):
        g = Library.gcd(a,b)
        tup = (a/g,b/g)
        if tup in frac: continue
        frac.append(tup)
length = len(frac)
for x in frac:
    for y in frac:
        xNum = x[0]
        xDen = x[1]
        yNum = y[0]
        yDen = y[1]
        #z=x+y
        tup = returnTup(xNum*yDen + yNum*xDen,yDen*xDen)
        if tup !=(0,0): add(s(x,y,tup))
        #z=xy/(x+y)
        tup = returnTup(xNum*yNum,xNum*yDen+xDen*yNum)
        if tup !=(0,0): add(s(x,y,tup))
        if ((xNum*yDen)**2+(xDen*yNum)**2)**0.5==int(((xNum*yDen)**2+(xDen*yNum)**2)**0.5):
            #z=xy/sqrt(x^2+y^2)
            tup = returnTup(xNum*yNum,int(((xNum*yDen)**2+(xDen*yNum)**2)**0.5))
            if tup !=(0,0): add(s(x,y,tup))
            #z=sqrt(x^2+y^2)
            tup = returnTup(int(((xNum*yDen)**2+(xDen*yNum)**2)**0.5),xDen*yDen)
            if tup !=(0,0): add(s(x,y,tup))
print u[1]+u[0]
        


k = 35
frac=[]
sums=[]
u = [0,1]
def returnTup(numerator,denominator):
    g = Library.gcd(numerator,denominator)
    numerator/=g
    denominator/=g
    z=(numerator,denominator)
    if z in frac:return z
    else:return (0,0)

def s(x,y,z):
    numerator = x[0]*y[1]*z[1]+x[1]*y[0]*z[1]+x[1]*y[1]*z[0]
    denominator = x[1]*y[1]*z[1]
    g = Library.gcd(numerator,denominator)
    numerator/=g
    denominator/=g
    return (numerator, denominator)

def add(value):
    if value not in sums:
        sums.append(value)
        newNum = value[0]*u[1]+u[0]*value[1]
        newDen = u[1]*value[1]
        g = Library.gcd(newNum,newDen)
        newNum /=g
        newDen /=g
        u[0]=newNum
        u[1]=newDen

for a in xrange(1,k):
    for b in xrange(a+1,k+1):
        g = Library.gcd(a,b)
        tup = (a/g,b/g)
        if tup in frac: continue
        frac.append(tup)
length = len(frac)
for x in frac:
    for y in frac:
        xNum = x[0]
        xDen = x[1]
        yNum = y[0]
        yDen = y[1]
        #z=x+y
        tup = returnTup(xNum*yDen + yNum*xDen,yDen*xDen)
        if tup !=(0,0): add(s(x,y,tup))
        #z=xy/(x+y)
        tup = returnTup(xNum*yNum,xNum*yDen+xDen*yNum)
        if tup !=(0,0): add(s(x,y,tup))
        if ((xNum*yDen)**2+(xDen*yNum)**2)**0.5==int(((xNum*yDen)**2+(xDen*yNum)**2)**0.5):
            #z=xy/sqrt(x^2+y^2)
            tup = returnTup(xNum*yNum,int(((xNum*yDen)**2+(xDen*yNum)**2)**0.5))
            if tup !=(0,0): add(s(x,y,tup))
            #z=sqrt(x^2+y^2)
            tup = returnTup(int(((xNum*yDen)**2+(xDen*yNum)**2)**0.5),xDen*yDen)
            if tup !=(0,0): add(s(x,y,tup))
print u[1]+u[0]
        

