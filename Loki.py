n=int(input())
arr=list(map(int,input().split()))
a=sum(arr)
su,dup,c=0,0,0
arr.sort(reverse=True)
for i in arr:
    su+=i
    dup=a-su
    c+=1
    if dup<su:
        break
print(c)