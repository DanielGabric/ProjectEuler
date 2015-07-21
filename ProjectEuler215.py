n=32
tot=0
maxi=-1
list1=[]
def rec(total,order):
    global tot
    global maxi
    global list1
    if total == n:
        f = list(order)
        if len(f)!=16:
            while len(f)<16:
                f = [0]+f

        list1.append(f)
        
        tot+=1

    if total + 2 <= n:
        rec(total+2,order+[2])
    if total+3 <=n:
        rec(total+3,order+[3])
rec(0,[])
print tot
print maxi
print list1