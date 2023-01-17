# First and Last Digit


t= int (input())

for tc in range(t):

   x=input()
   last=int(x)%10
   a= x[0]
   ans=int(a)+last

   print(ans)

#    for i in range(int(input())):
#     s = input()
#     print(int(s[0]) + int(s[len(s) - 1]))
