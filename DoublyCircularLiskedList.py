class Node:
    def __init__(self,prev=None,item=None,next=None):
        self.prev=prev
        self.item=item
        self.next=next
class DoublyCircularLL:
    def __init__(self,start=None):
        self.start=start
    def isEmpty(self):
    
        return self.start is None
    
    def insertAtStart(self,data):
        n=Node(None,data,None)
        if self.isEmpty():
            n.next=n
            n.prev=n
            self.start=n
        else:
            last=self.start.prev
            n.next=self.start
            n.prev=last
            self.start.prev=n
            last.next=n
            self.start=n
    def insertAtLast(self,data):
        n=Node(None,data,None)
        n.next=self.start
        n.prev=self.start.prev
        self.start.prev.next=n
        self.start.prev=n
    def deleteFirst(self,data):
        if self.isEmpty():
            return None
        elif self.start.next is None:
            if self.start.item==data:
                self.start=None
        else:
            if self.start.item==data:
                self.start.prev.next=self.start.next
                self.start.next.prev=self.start.prev
                self.start=self.start.next
    def deleteLast(self,data):
        if self.start.next.item==data:
            self.start.next=self.start

        else:
            last=self.start.prev
            if last.item==data:
                last.prev.next=self.start
                last=last.prev.next

    def deleteitem(self,data):
        temp=self.start
        while True:

            if temp.item==data:
                temp.prev.next=temp.next
                temp.next.prev=temp.prev
                return
            temp=temp.next



    def search(self,data):
        temp=self.start
        count=0
        while True:
            if temp.item==data:
               
                print(f"Node Found  {data} ")
                return
                

            temp=temp.next

            
    def print(self):
        if self.isEmpty():
            print("List is empty")
            return
        temp = self.start
        while True:
            print(temp.item, end=" ")
            temp = temp.next
            if temp == self.start:
                break
        print()
    def __iter__(self):
        if self.start is None:
            return iterator(None)
        else:
            return iterator(self.start)

class iterator:
    def __init__(self,first):
        self.current=first
        self.first=first
        self.first_pass = True if first else False
    def __iter__(self):
        return self
    def __next__(self):
        if self.current==None:
            raise StopIteration
        if not self.first_pass and self.current == self.first:
            raise StopIteration
        
        data=self.current.item
        self.current=self.current.next
        self.first_pass=False
        return data





DDLL=DoublyCircularLL()
DDLL.insertAtStart(10)
DDLL.insertAtStart(20)
DDLL.insertAtStart(30)
DDLL.insertAtLast(40)
DDLL.insertAtLast(50)
DDLL.print()
"""
DDLL.deleteFirst(30)
DDLL.deleteFirst(20)
DDLL.deleteLast(50)
DDLL.deleteLast(40)"""
DDLL.deleteitem(10)
DDLL.search(20)
#DDLL.print()
for i in DDLL:
    print(i,end=" ")
print()
