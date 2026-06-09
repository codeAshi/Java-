nums=[1,2,4,5,7,7]
target=8
result=[]
no=[-1,-1]
for i in range(len(nums)):
    if nums[i] ==target:
        result.append(i)
    if i not in nums:
        print(no)
       

print(result)

