p=[1,3,4,6]
#p.replace(-1,)
re=p[-1]+1
print(re)
p[-1]=re
print(p)
for i in range(len(p)):
    if i==len(p)-1:
        p.append(i+1)
        print(i,p[i])

    #print(p[i])