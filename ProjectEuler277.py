sequence = "dDUUdDDUDDddDdDddDDUDDdddUDDDU"
LIMIT = 10**15
def returnNext(l,n):
  if l=='D':
    return 3*n
  elif n%4==2 and l=='U':
    return (3*n-2)/4
  elif n%2==1 and l=='d':
    return (3*n+1)/2
  else:
    return -1
answer=0
print startVal
while answer <= LIMIT or answer == -1:
  temp=startVal
  for chars in sequence:
    temp = returnNext(chars,temp)
    if temp ==-1: break
  answer = temp
  startVal+=1
print answer