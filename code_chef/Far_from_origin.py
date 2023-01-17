import math


for tc in range(int(input())):
    a1,a2,b1,b2= map(int,input().split())
    #alex distance
    ansA= a1*a1 + a2*a2
    finalA=math.sqrt(ansA)

    ansB=b1*b1 + b2*b2
    finalB=math.sqrt(ansB)

    if finalA > finalB:
        print("alex")
    elif finalA < finalB:
        print("bob")
    else:
        print("equal")