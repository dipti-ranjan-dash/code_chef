
x,y=map(float,input().split())
if x%5==0 and y+0.5>x :
    print(float(y-(x+0.5)))
else:
    print(float(y))    
