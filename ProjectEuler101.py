def u(n):
    return 1 -n+n**2-n**3+n**4-n**5+n**6-n**7+n**8-n**9+n**10
degree = 10
sumOfFits=1
beginning = [u(i) for i in range(1,3)]
print beginning
for i in range(2,degree+1):
    P=0
    for j in range(0,i):
        Pj=beginning[j]
        PjB =1
        for k in range(0,i):
            if k!=j:
                Pj *= (i-k)
                PjB *=(j-k)
        P += Pj/PjB
    if P != u(i+1):
        sumOfFits +=P
    beginning.append(u(i+1))
print sumOfFits