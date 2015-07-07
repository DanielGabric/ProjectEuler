cache={}
possible = ["O","L","A"]
def rec(N,lates,lastTwo,R=""):
    sums=0
    if N==0:
        return 1
    key = (N,lates,lastTwo)
    if key in cache:
        return cache[key]
    for i in possible:
        if i=="L" and lates < 1:
            sums+=rec(N-1,lates+1,lastTwo[1::]+i,R+i)
        elif i=="A" and lastTwo != "AA":
            sums+=rec(N-1,lates,lastTwo[1::]+i,R+i)
        elif i=="O":
            sums+=rec(N-1,lates,lastTwo[1::]+i,R+i)
    cache[key]=sums
    return sums
print rec(30,0,"FF")
