import math
dictionary={}
raw = raw_input()
lists = raw.split("\",\"")
squares = [i*i for i in range(31623)]
A = ord('A')
for i in lists:
    someList = [0]*26
    for c in i:
        someList[ord(c)-A]+=1
    dictionary[i]=someList
maximum=-1
for i in range(len(lists)):
    for j in range(i+1,len(lists)):
        if dictionary[lists[i]]==dictionary[lists[j]]:
            length = len(lists[i])
            end = int(math.ceil(int(10**length)**0.5))
            start = int(math.ceil(int(10**(length-1))**0.5))
            for k in range(start,end):
                alphabet=[0]*26
                reverse = lists[i][::-1]
                m=squares[k]
                n=0
                b = True
                while m>0:
                    if m%10 in alphabet:
                        if ord(reverse[n])-A!=alphabet.index(m%10):
                            b = False
                            break
                    else:
                        alphabet[ord(reverse[n])-A]=m%10
                    n+=1
                    m/=10
                n=0
                m=0
                if b:
                    for c in lists[i]:
                        n = (n*10)+alphabet[ord(c)-A]
                    if n in squares:
                        for c in lists[j]:
                            m = (m*10)+alphabet[ord(c)-A]
                        if m in squares:
                            if m > maximum:maximum=m
                            if n > maximum:maximum=n
print maximum                