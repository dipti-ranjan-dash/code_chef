# Lucky Four

for tc in range (int(input())):

    x=input()
    sum=0

    for i in range (len(x)):
        if int(x[i]) ==4 :
          sum+=1


    print(sum)