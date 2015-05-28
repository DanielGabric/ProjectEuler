div = [5,11,17,23,29,41,47]
h=0
N=12017639150/2
for i in xrange(1,N,3):
    for x in div:
        if i % x !=0 :
            h=h+1
print h 