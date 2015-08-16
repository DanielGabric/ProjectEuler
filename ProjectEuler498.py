from Library import powMod
n = 10**13
m = 10**12
d = 10**4
MOD = 10**9-63
factorial = [1]+[0]*10000000
for i in xrange(1,10000001):factorial[i]=(factorial[i-1]*i)%MOD
def solve(n,m):
    prod=1
    while n >0 and m >0:
        if m%MOD <= n%MOD:
            prod *= factorial[n%MOD]*powMod(factorial[m%MOD]*factorial[(n%MOD)-(m%MOD)],MOD-2,MOD)
            prod %= MOD
        n//=MOD
        m//=MOD
    return prod%MOD
print (solve(n,d)*solve(n-d-1,n-m))%MOD