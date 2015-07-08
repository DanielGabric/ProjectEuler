s=0
for e in range(1, 100):
    for A in range(1, 10):
        for d in range(1, 10):
            L = 10**e
            if ((L-A)*d)%(10*A-1)==0:
                if ((L-A)*d)/(10*A-1)>=L/10:
                    s+=10*(((L-A)*d)/(10*A-1))+d
                    s%=100000
print s 