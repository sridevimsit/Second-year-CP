# A happy prime is a number that is both happy and prime. 
# Write the function nthHappyPrime(n) which takes a non-negative integer 
# and returns the nth happy prime number (where the 0th happy prime number is 7).



#def fun_nth_happy_prime(n):
#	return 0
# Write the function nthHappyNumber(n) which takes a non-negative integer 
# and returns the nth happy number (where the 0th happy number is 1). 
# Here are some test assertions for you:
# assert(nthHappyNumber(0) == 1)
# assert(nthHappyNumber(1) == 7)
# assert(nthHappyNumber(2) == 10)
# assert(nthHappyNumber(3) == 13)
# assert(nthHappyNumber(4) == 19)
# assert(nthHappyNumber(5) == 23)
# assert(nthHappyNumber(6) == 28)
# assert(nthHappyNumber(7) == 31)
def sumOfSquaresOfDigits(num):
	rem = sum=0
	
	while(num > 0):    
		rem = num%10    
		sum = sum + (rem*rem)    
		num = num//10    
	return sum  

def isHappyNumber(n):
    set1 = set()			
    while n != 1:
        n = sumOfSquaresOfDigits(n)
        if n in set1:
            return False
        set1.add(n)
    return True

def fun_nth_happy_prime(i):
	if i==0:
		return 7
	count=0
	num = 1 
	res=0
	while count<=i:
		
		if isHappyNumber(num):
			if isPrime(num):
				count+=1
				res=num
		num+=1
	
	return res

def isPrime(n):
	if n<2:
		return False
	if n==2:
		return True
	for i in range(2,n//2+1):
		if n%i==0:
			return False
	return True