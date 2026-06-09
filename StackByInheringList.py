#from StackUsingSLL import Node
class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next
    
class linkedList:
    def __init__(self,start=None):
        self.start=start
    def isEmpty(self):
        return self.start is None
    def push(self,data):
        n=Node(data,self.start)
        self.start=n
    def pop(self):
        if self.isEmpty():
            return None
        val=self.start.item
        self.start=self.start.next
        return val
    def peek(self):
        if self.isEmpty():
            return AttributeError("Stack is Empty")
        return self.start.item
    
class stack(linkedList):
    def __init__(self):
        self.item_count=0
    def push2(self,data):
        self.push(data)
        self.item_count  +=1
    def pop2(self):
        self.pop()
        self.item_count-=1
    
    def peek2(self):
        self.peek()
    def size(self):
        return self.item_count

SLL=stack()
SLL.push2(10)
SLL.push2(20)
SLL.pop2()
print(SLL.peek2())
print(SLL.size())
    
