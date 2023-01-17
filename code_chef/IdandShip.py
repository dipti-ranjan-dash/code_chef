# Id and Ship

# cook your dish here
for t in range(int(input())):
    x=input()
    if x=="B" or x=="b":
        print("BattleShip")
    elif x=="C" or x=="c":
        print("Cruiser")
    elif x=="D" or x=="d":
        print("Destroyer")
    else:
        print("Frigate")  


#         # cook your dish here
# dic = {'b':'BattleShip', 'c':'Cruiser', 'd':'Destroyer', 'f':'Frigate'}
# for i in range(int(input())):
#     print(dic[input().lower()])