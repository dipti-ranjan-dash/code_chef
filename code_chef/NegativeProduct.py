

for tc in range (int(input())):
    a,b,c=map (int,input().split())
    p=a*b
    q=b*c
    r=a*c
    if p<0 or q<0 or r<0:

       print("yes")
    else :
      print("no")




