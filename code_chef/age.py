
# Age Limit
# Difficulty Rating:245

# cook your dish here

t = int(input())
for tc in range (t):
    x,y,a=map(int,input().split())
    
    if a>=x and a<y:
        print("yes")
    else :
        print("no")