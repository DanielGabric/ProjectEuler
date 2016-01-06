n = 10**6
mod = 10**9+7
print sum([((pow(1-k*k,n+1,mod)-1)*pow(-k*k,mod-2,mod)-1)%mod for k in xrange(1,n+1)])%mod