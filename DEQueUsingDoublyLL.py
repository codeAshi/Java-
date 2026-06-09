class Node:
    def __init__(self,prev=None,item=None,next=None):
        self.prev=prev
        self.item=item
        self.next=next

class DEQue:
    def __init__(self,start=None):
        self.start=start

    def isEmpty(self):
        return self.start==None
    def insertAtFront(self,data):
        n=Node(None,data,self.start)
        if not self.isEmpty():
            self.start.prev=n
        self.start=n
        
    def insertAtRear(self,data):
        if self.isEmpty():
            n=(None,data,None)
        else:
            temp=self.start
            while temp.next is not None:
           
                temp=temp.next
            n=Node(temp,data,None)
            temp.next=n
        

    def FrontElement(self):
        return self.start.item
    def removeFront(self):
        if self.start.next is None:
            self.start=None
        self.start.next.prev=None
        self.start=self.start.next

    def removeLast(self):
        temp=self.start
        while temp.next is not None:
            temp=temp.next
        temp.prev.next=None
    def last(self):
        temp=self.start
        while temp.next is not None:
            temp=temp.next
        return temp.item

q4=DEQue()
q4.insertAtFront(10)
q4.insertAtFront(20)
q4.insertAtFront(30)
q4.insertAtFront(50)
q4.insertAtRear(60)
print("Current Front :",q4.FrontElement())
q4.removeFront()
print("Current Front :",q4.FrontElement())
print("Current LAst Element :",q4.last())
q4.removeLast()
print("Current Last Element :",q4.last())
