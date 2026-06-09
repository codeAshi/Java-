class Node:
    def __init__(self,item=None,priority=None,next=None):
        self.item=item
        self.priority=priority
        self.next=next

class PriorityQueue:
    def __init__(self,start=None):
        self.start=start
        self.item_count=0

    def isEmpty(self):
        return self.start==None
    
    def push(self,data,priority):
        n=Node(data,priority)
        index=0
        if not self.start or priority <self.start.priority:
            n.next=self.start
            self.start=n
        else:
            temp=self.start
            while temp.next and temp.next.priority<=priority:
                temp=temp.next
            n.next=temp.next
            temp.next=n
        self.item_count+=1

    def pop(self):
        if self.isEmpty():
            raise IndexError("Priority Queue Is Empty")
        data=self.start.item
        self.start=self.start.next
        self.item_count-=1
        return data
    
    
    def size(self):
        return self.item_count()
    
pq2=PriorityQueue()
pq2.push("Ashish",4)
pq2.push("Raj",1)
pq2.push("Pankaj",2)
pq2.push("Mane",3)

while not pq2.isEmpty():
    print(pq2.pop())
pq2.push("ketan",1)
pq2.push("kushi",2)
print("pop element :",pq2.pop())
print("Pop element :",pq2.pop())


