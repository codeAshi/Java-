class Node:
    def __init__(self,prev=None,item=None,next=None):
        self.prev=prev
        self.item=item
        self.next=next
class doublyList:
    def __init__(self,start=None):
        self.start=start
    def isEmpty(self):
        if self.start is None:
          return self.start==None
    def insertAtFirst(self,data):
        n=Node(None,data,self.start)
        if not self.isEmpty():
            self.start.prev=n   
        self.start=n

        
    

    def printList(self):
        temp=self.start
        while temp is not None:
            print(temp.item,end=" ")
            temp=temp.next
        print()
    def deleteitem(self,data):
        if not self.isEmpty():
            temp=self.start
            while temp.next is not None:
                if self.start.item==data:
                    self.start=self.start.next
                    self.start.prev=None
                    return

                if temp.item==data:
                    temp.prev.next=temp.next
                    temp.next.prev=temp.prev
                else:
                    
                    temp.prev.next=None
                    return

                temp=temp.next
        
     

DLL=doublyList()
DLL.insertAtFirst(30)
DLL.insertAtFirst(20)
DLL.insertAtFirst(10)
DLL.deleteitem(30)
DLL.printList()