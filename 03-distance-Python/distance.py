# Write the function fun_distance(x1, y1, x2, y2) 
# that takes four int values x1, y1, x2, y2 
# that represent the two points (x1, y1) and (x2, y2), 
# and returns the distance between those points as a int.


def fun_distance(x1, y1, x2, y2):
	# your code goes here
	return int(((x2-x1)**2+(y2-y1)**2)**(1/2))

#print(fun_distance(0, 0, 0, -2)== 2)
#print(fun_distance(-20, 23, -15, 68)==45)
#print(fun_distance(30, 37, 79, -51)==100)
#print(fun_distance(-69, 63, 57, 11)==136)
