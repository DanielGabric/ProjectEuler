import Library
tot=0
for i in xrange(1,10**7,2):
    if Library.isPrime(i):
        mod = Library.modinv(10,i)
        if mod != None:tot+= mod
print tot