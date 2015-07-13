from decimal import *
from math import *
getcontext().prec=200
primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43]
exponents=[39, 19, 9, 6, 3, 3, 2, 2, 1, 1, 1, 1, 1, 1]
N=43
fact=1
for i in xrange(len(primes)):
    fact *= primes[i]**exponents[i]
curt = int(fact**(1.0/3.0))
length = len(primes)
A=1
saved = [[primes[j]**i for i in xrange(0,exponents[j]+1)] for j in xrange(length)]
toCheck=[]
RATIO = Decimal(200)
for a in xrange(exponents[0]+1):
    print a
    A*=saved[0][a]
    if A>int(1.0001*curt): 
        A/=saved[0][a]
        break
    for b in xrange(exponents[1]+1):
        A*=saved[1][b]
        if A>int(1.0001*curt): 
            A/=saved[1][b]
            break
        for c in xrange(exponents[2]+1):
            A*=saved[2][c]
            if A>int(1.0001*curt): 
                A/=saved[2][c]
                break
            for d in xrange(exponents[3]+1):
                A*=saved[3][d]
                if A>int(1.0001*curt): 
                    A/=saved[3][d]
                    break
                for e in xrange(exponents[4]+1):
                    A*=saved[4][e]
                    if A==1 or A>int(1.0001*curt): 
                        A/=saved[4][e]
                        break
                    for f in xrange(exponents[5]+1):
                        A*=saved[5][f]
                        if A>int(1.0001*curt):
                            A/=saved[5][f]
                            break
                        for g in xrange(exponents[6]+1):
                            A*=saved[6][g]
                            if A>int(1.0001*curt): 
                                A/=saved[6][g]
                                break
                            for h in xrange(exponents[7]+1):
                                A*=saved[7][h]
                                if A>int(1.0001*curt): 
                                    A/=saved[7][h]
                                    break
                                for i in xrange(exponents[8]+1):
                                    A*=saved[8][i]
                                    if A>int(1.0001*curt): 
                                        A/=saved[8][i]
                                        break
                                    for j in xrange(exponents[9]+1):
                                        A*=saved[9][j]
                                        if A>int(1.0001*curt): 
                                            A/=saved[9][j]
                                            break
                                        for k in xrange(exponents[10]+1):
                                            A*=saved[10][k]
                                            if A>int(1.0001*curt): 
                                                A/=saved[10][k]
                                                break
                                            for l in xrange(exponents[11]+1):
                                                A*=saved[11][l]
                                                if A>int(1.0001*curt): 
                                                    A/=saved[11][l]
                                                    break
                                                for m in xrange(exponents[12]+1):
                                                    A*=saved[12][m]
                                                    if A>int(1.0001*curt): 
                                                        A/=saved[12][m]
                                                        break
                                                    for n in xrange(exponents[13]+1):
                                                        A*=saved[13][n]
                                                        if A>int(1.0001*curt): 
                                                            A/=saved[13][n]
                                                            break
                                                        if A >= int(0.9999*curt):
                                                            toCheck.append(A)
                                                        A/=saved[13][n]
                                                    A/=saved[12][m]
                                                A/=saved[11][l]
                                            A/=saved[10][k]
                                        A/=saved[9][j]
                                    A/=saved[8][i]
                                A/=saved[7][h]
                            A/=saved[6][g]
                        A/=saved[5][f]
                    A/=saved[4][e]
                A/=saved[3][d]
            A/=saved[2][c]
        A/=saved[1][b]
    A/=saved[0][a]
for i in toCheck:
    for j in toCheck:
        if i > j:continue
        if fact % (i*j)==0:
            if i <= fact/(i*j) <= j:
                newRat = Decimal(j)/Decimal(i)
                if newRat < RATIO:
                    RATIO = newRat
                    Fn = i+j+fact/(i*j)
print Fn
