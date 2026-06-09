class priorityQueue:
    def __init__(self):
        self.item=[]
    
    def isEmpty(self):
        return len(self.item)==0
    
    def push(self,data,priority=0):

        self.item.append((priority,data))
        self.item.sort(key=lambda x: x[0])

    def pop(self):
        if self.isEmpty():
            raise AttributeError("Queue Is Empty")

        return self.item.pop(0)[1]

    def size(self):
        return len(self.item)
    
    def Front(self):
        return self.item[0][1]
    
pq1=priorityQueue()
pq1.push("Ashish",3)  #fourth
pq1.push("Raj",2)    #third
pq1.push("Ketan",9)   #last
pq1.push("Mane",0)   #first
pq1.push("pankaj",1)  #second
print("Size of Queue",pq1.size())
#pq1.pop()
#print(pq1.Front())
print("Printing By Prioriy")
while not pq1.isEmpty():
    print(pq1.pop())
#print(pq1.pop())         calls an Error 
print("")


     