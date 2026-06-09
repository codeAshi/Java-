class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next
class stack:
    def __init__(self,last=None):
        self.start=last
    def isEmpty(self):
        if self.start is None:
            return self.start==None
        
        #Approch that insert at end 
    def push(self,data):
        n=Node(data)
        if not self.isEmpty():
            temp=self.start
            while temp.next is not None:
                temp=temp.next
            temp.next=n
        else:
            self.start=n
            
         

    def peek(self):
        if self.isEmpty():
            return AttributeError("List is Empty")
        return self.start.item
   
    def pop(self):
        if self.isEmpty():
            return None
        temp = self.start
        if temp.next is None:
            val = temp.item
            self.start = None
            return val
        while temp.next.next is not None: 
            temp = temp.next
        val = temp.next.item
        temp.next = None
        return val
    #approch from start node and delete first node

    def push2(self,data):
 
        n=Node(data,self.start)
        self.start=n
    def pop2(self):
        if self.isEmpty():
            return None
        val =self.start.item
        self.start=self.start.next
        return val
      


SLL=stack()
SLL.push2(10)
SLL.push2(20)
print(SLL.peek())
#SLL.pop()
SLL.push2(30)
print(SLL.peek())
SLL.pop2()
SLL.pop2()
SLL.pop2()
print(SLL.peek())
