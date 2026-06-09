class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next
class queue:
    def __init__(self,start=None,rear=None):
        self.front=start
        self.rear=rear
        self.item_count=0
    
    def isEmpty(self):
        return self.front==None
    
    def enqueue(self,data):
        n=Node(data)
        if self.isEmpty():
            self.front=n
        else:
            self.rear.next=n
        self.rear=n
        self.item_count+=1

    def dequeue(self):
        if self.isEmpty():
            return AttributeError("Queue Is empty ")
        elif self.front ==self.rear:
            self.front=None
            self.rear=None
        else:
            self.front=self.front.next
        
        self.item_count-=1

    def getFront(self):
        return self.front.item
    def getRear(self):
        return self.rear
    def count(self):
        return self.item_count
    
q2=queue()
q2.enqueue(10)
q2.enqueue(20)
q2.enqueue(30)
q2.enqueue(40)
q2.dequeue()  #10 removed
q2.dequeue()  #20 removed
print(q2.getFront())
print(q2.count())
