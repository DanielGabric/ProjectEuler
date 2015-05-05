prev = [-1]*1500000
START = 10
END = 40
totSum=0

def rec(num_digits, current_digit, allDigits):
    binRep = 1 << current_digit
    if num_digits == 1:
        if allDigits == 0 or allDigits == binRep:
            return 1
        else:
            return 0
    sum1 = 0
    hash1 = current_digit+10*num_digits+1000*allDigits
    if prev[hash1]!=-1:
        return prev[hash1]
    if allDigits & binRep != 0:
        allDigits -= binRep
    if current_digit > 0:
        sum1 += rec(num_digits-1,current_digit-1,allDigits)
    if current_digit < 9:
        sum1 += rec(num_digits-1,current_digit+1,allDigits)
    prev[hash1]=sum1
    return sum1

for i in range(START,END+1):
    for j in range(1,10):
        totSum += rec(i,j,1023)
print totSum
