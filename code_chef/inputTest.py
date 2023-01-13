# Enormous Input Test


n,k=map(int,input().split())

sum=0

for tc in range(n) :
    x=int(input() )
    if x%k==0 :
     sum=sum+1

print(sum)