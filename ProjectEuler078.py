N = 70000
ways = [1]+[0]*N
for i in range(1,N+1):
    for j in range(i,N+1):
        ways[j]+=ways[j-i]
for i in range(0,N+1):
    if ways[i]%1000000==0:
        print i 
        break