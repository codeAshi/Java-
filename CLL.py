class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next
class CircularList:
    def __init__(self,last=None):
        self.last=last
    def isEmpty(self):
        return self.last==None
    def insertAtStart(self,data):
        n=Node(data)
        if self.isEmpty():
            n.next=n
            self.last=n
        else:
            n.next=self.last.next
            self.last.next=n

    def insertAtLast(self,data):
        n=Node(data)
        if self.isEmpty():
            n.next=n
            self.last=n
        else:
            n.next=self.last.next
            self.last.next=n
            self.last=n
    def search(self,data):
        if self.isEmpty():
            return None
        temp=self.last.next 
        while temp !=self.last:
            if temp.item==data:
                return temp
            temp=temp.next
        if temp.item==data: ###one node
            return temp  #this temp is used in insertAfter by directly giving the temp value 
        return None

    def insertAfter(self,temp,data):
        if temp is not None:
            n=Node(data,temp.next) 
            temp.next=n
            if temp==self.last:
                self.last=n 
    def deleteFirst(self):
        None

    def deleteFirst(self):
        if not self.isEmpty():
            if self.last.next==self.last:
                self.last=None
            else:
                self.last.next=self.last.next.next
    def deleteLast(self):
        if not self.isEmpty():
            temp=self.last.next
            while temp.next!=self.last:
                temp=temp.next
            temp.next=self.last.next
            self.last=temp
    def deleteItem(self,data):
        if not self.isEmpty():
            if self.last.next==self.last:
                if self.last.item==data:
                    self.last=None
            else:
                if self.last.next.item==data:
                    self.deleteFirst()
                else:
                    temp=self.last.next
                    while temp.next!=self.last:
                      
                        if temp.next.item==data:
                            temp.next=temp.next.next
                            break
                        temp=temp.next
                 
                
                    if self.last.item==data:
                        self.deleteLast()
    def __iter__(self):
        if self.last==None:

            return iterator(None)     
        else:
            return iterator(self.last.next)                

    def printList(self):
        temp=self.last.next
        while True:
            print(temp.item,end=" ")
            temp=temp.next
            if temp==self.last.next:
                break
        print()

class iterator:
    def __init__(self,first):
        self.current=first
        self.start=first  #remember the firstNode 
        self.count=0
    def __iter__(self):
        return self
    def __next__(self):
        if self.current==None:
            raise StopIteration
        if self.current==self.start and self.count==1:
            raise StopIteration
        else:
            self.count=1
        data=self.current.item
        self.current=self.current.next
        return data
        
        
       

CLL=CircularList()
CLL.insertAtStart(10)
CLL.insertAtStart(20)
CLL.insertAtStart(30)
CLL.insertAtStart(40)
node=CLL.search(20)
CLL.insertAfter(node,30)
dele=CLL.search(40)



CLL.insertAtLast(40)
CLL.insertAtLast(50)
CLL.insertAtLast(60)
CLL.insertAtLast(70)
CLL.insertAtLast(80)
CLL.deleteFirst()
CLL.deleteLast()
CLL.deleteItem(10)
CLL.deleteItem(70)
CLL.deleteItem(50)
CLL.printList()
print()
for x in CLL:
    print(x,end=" ")
print()