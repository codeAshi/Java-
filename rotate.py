list1=[1,2,3,4,5]

# list1.reverse()
# print(list1)
temp=list1[-1]
for i in range(len(list1)-1,-1,-1):
    list1[i]=list1[i-1]
    
list1[0]=temp
print(list1)