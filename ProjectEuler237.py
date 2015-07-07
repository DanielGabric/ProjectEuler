import Library
T = [[0,1,0,0],[0,0,1,0],[0,0,0,1],[1,-2,2,2]]
F = [[1],[1],[4],[8]]
print Library.mul(Library.pow(T,10**12-1,10**8),F,10**8)[0][0]