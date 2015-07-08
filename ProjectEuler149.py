def max_subarray(A):
    max_ending_here = max_so_far = 0
    for x in A:
        max_ending_here = max(0, max_ending_here + x)
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far
matrix = [[0 for i in xrange(2000)]for i in xrange(2000)]
lagged = [0 for i in xrange(2000*2000)]
for i in xrange(2000*2000):
    if 1<=(i+1)<=55:
        lagged[i]=(100003-200003*(i+1)+300007*(i+1)*(i+1)*(i+1))%1000000-500000
    else:
        lagged[i]=(lagged[i-24]+lagged[i-55])%1000000-500000
for i in xrange(2000):
    for j in xrange(2000):
        matrix[i][j]=lagged[i*2000+j]
maximum = -1
#vertical and horizontal
for i in xrange(2000):
    maximum = max(maximum,max_subarray(matrix[i]))
    m = []
    for j in xrange(2000):
        m.append(matrix[j][i])
    maximum = max(maximum,max_subarray(m))
print maximum