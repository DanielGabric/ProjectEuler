def factorial(n):return reduce(lambda x,y:x*y,[1]+range(1,n+1))
print max(((2**n-n-1)*factorial(26)//(factorial(n)*factorial(26-n)))for n in range(2,26)) 