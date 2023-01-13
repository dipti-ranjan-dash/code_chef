t = int (input())

for tc in  range(t):
    n=input()
    l=len(n)
    sum=0
    for x in range (l):
    
     sum+=int(n)%10
     n=int(n)/10
     print(sum)




#      T=int(input())
# for i in range(T):
#     num=int(input())
#     sum=0
#     for j in str(num):
#         sum+=int(j)
#     print(sum)


