#Determine the Score code chef
t = int (input())

while t>0 :
    a, b = map(int,input().split())
    print(int(a/10*b))
    t-=1

