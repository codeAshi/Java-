# arr=[3,6,1,1,2,3]
# #output--arr[4,5]
# #find the missing number for the array
# arr.sort()
# count = 1
# res=[]
# #112336
# for i in range(0,len(arr)):
#     while count<arr[i]:
#         res.append(count)
#         count+=1
#     if count==arr[i]:
#         count+=1

# print(res)


# [1,2,3,4,5]
# [5,1,2,3,4]
arr=[1,2,3,4,5]
f=arr[len(arr)-1]
start=1
end=4
while end>=start:
    arr[end]=arr[end-1]
    end-=1

arr[0]=f
print(arr)



