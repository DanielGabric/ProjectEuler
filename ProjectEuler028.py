sums = 1
n = 2
start = 1
while start < 1001**2:
    for i in range(4):
        start+=n
        sums += start
    n+=2
print sums