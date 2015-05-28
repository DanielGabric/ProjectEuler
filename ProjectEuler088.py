def rec(sums,product,k):
    if sums < k:return False
    if k==1 and product == sums: return True
    if product ==1 and k==sums: return True
    j=2
    while j <=product and sums-j>=k-1:
        if product %j==0 and rec(sums-j,product/j,k-1)==True:return True
        j+=1
    return False
tot=0
saved = []
for i in range(2,12001):
    j=i+1
    while rec(j,j,i)==False:
        j+=1
    if j not in saved:
        tot+=j
    saved.append(j)
print tot 
