from time import clock
time1 = clock()

steps = "UDDDUdddDDUDDddDdDddDDUDDdUUDd"[::-1]

N = 10**15

def step_back(n, letter):
    if letter == 'D':
        return n*3
    elif letter == 'd' and n % 2 == 1:
        return (3*n + 1) // 2
    elif letter == 'U' and n % 4 == 2:
        return (3*n - 2) // 4
    else:
        return None

def back(n):
    for letter in steps:
        n = step_back(n, letter)
        if n is None:
            return None
    return n

n = int(10**15 * pow(1/3, steps.count("D")) * pow(2/3, steps.count("d")) * pow(4/3, steps.count("U")))
n0 = None
while n0 is None or n0 <= N:
    n0 = back(n)
    n += 1

print(n0)  # Answer: 1125977393124310
        
time2 = clock()
print("N = {0:d} Time = {1:.1f}".format(N, time2 - time1))