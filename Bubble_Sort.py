def bubble(data_List):
    for i in range (1,len(data_List)):
        for j in range (len(data_List)-i):
            if data_List[j]>data_List[j+1]:
                data_List[j],data_List[j+1]=data_List[j+1],data_List[j]

def Modified_bubble_sort(data_List):
    flag=False
    for i in range (1,len(data_List)):
        flag=False
        for j in range(len(data_List)-i):
            if data_List[j]>data_List[j+1]:
                data_List[j],data_List[j+1]=data_List[j+1],data_List[j]
                flag=True

        if not flag:
            break


l=[12,10,50,25,67,55]
#ob=bubble(l)
ob1=Modified_bubble_sort(l)
print(l)