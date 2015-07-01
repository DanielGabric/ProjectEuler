import Library
MOD = 1307674368000
N = 10**15
T = [[0,0,0],[0,0,1],[0,1,1]]
sums=0
print sum([(Library.pow(T,N+1,(x*x+x-1)*MOD)[1][1]*Library.powMod(x,N+2,(x*x+x-1)*MOD)+
            Library.pow(T,N+2,(x*x+x-1)*MOD)[1][1]*Library.powMod(x,N+1,(x*x+x-1)*MOD)-x)/((x*x+x-1))%MOD 
            for x in xrange(1,101)])%MOD
