#Burgers Difficulty Rating:263
T = int(input())
for tc in range(T):
	# Read integers a and b.
	a,b,c = (map(int,input().split())) 
	print(min(a,b,c))