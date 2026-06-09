l=[1,5,3,2,8,9]
for i in range(len(l)):
  for j in range(i+1,len(l)):
    for k  in range(i+2,len(l)):
        if l[i]+l[j]+l[k]==10:
            print(l[i],l[j],l[k])

