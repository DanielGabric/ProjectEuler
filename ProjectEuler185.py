numbers =[
[2,3,2,1,3,8,6,1,0,4,3,0,3,8,4,5],
[6,3,7,5,7,1,1,9,1,5,0,7,7,0,5,0],
[6,9,1,3,8,5,9,1,7,3,1,2,1,3,6,0],
[3,1,7,4,2,4,8,4,3,9,4,6,5,8,5,8],
[8,1,5,7,3,5,6,3,4,4,1,1,8,4,8,3],
[4,8,9,5,7,2,2,6,5,2,1,9,0,3,0,6],
[3,8,4,7,4,3,9,6,4,7,2,9,3,0,4,7],
[2,3,2,6,5,0,9,4,7,1,2,7,1,4,4,8],
[5,2,5,1,5,8,3,3,7,9,6,4,4,3,2,2],
[2,6,5,9,8,6,2,6,3,7,3,1,6,8,6,7],
[5,6,1,6,1,8,5,6,5,0,5,1,8,2,9,3],
[4,5,1,3,5,5,9,0,9,4,1,4,6,1,1,7],
[2,6,1,5,2,5,0,7,4,4,3,8,6,8,9,9],
[6,4,4,2,8,8,9,0,5,5,0,4,2,7,6,8],
[1,7,4,8,2,7,0,4,7,6,7,5,8,2,7,6],
[3,0,4,1,6,3,1,1,1,7,2,2,4,6,3,5],
[1,8,4,1,2,3,6,4,5,4,3,2,4,5,8,9],
[5,8,5,5,4,6,2,9,4,0,8,1,0,5,8,7],
[9,7,4,2,8,5,5,5,0,7,0,6,8,3,5,3],
[4,2,9,6,8,4,9,6,4,3,6,0,7,5,4,3],
[7,8,9,0,9,7,1,5,4,8,9,0,8,0,6,7],
[8,6,9,0,0,9,5,8,5,1,5,2,6,2,5,4],
]

possible = []
M = 16
N = len(numbers)
newThing = [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1]
constraints = [0,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3]
for i in range(M):
    toAdd = []
    for j in range(N):
        if numbers[j][i] not in toAdd and constraints[j]!=0:
            toAdd.append(numbers[j][i])
    possible.append(toAdd)
def backtrack(n):
    if n >= M  :
        if sum(constraints)==0:
            return True
        else:
            return False
    for i in possible[n]:
        isGood = True
        for j in range(N):
            if numbers[j][n]==i and constraints[j]==0:
                isGood=False
                break
        if isGood:
            for j in range(N):
                if numbers[j][n]==i:
                    constraints[j]-=1
            newThing[n]=i
            if backtrack(n+1): return True
            for j in range(N):
                if numbers[j][n]==i :
                    constraints[j]+=1
            newThing[n]=-1
    return False
backtrack(0)
print newThing