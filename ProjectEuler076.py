sums = [1]+[0]*100
for i in range(1,100):
    for j in range(i,101):
        sums[j]+=sums[j-i]
print sums[100] 