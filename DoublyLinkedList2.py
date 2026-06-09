class Node :
    def __init__(self,prev=None,item=None,next=None):
        self.perv=prev
        self.item=item
        self.next=next

class DLL:
    def __init__(self):
        self.start=None

    def isEmpty(self):
        return self.start==None
    def insertAtStart(self,data):
        n=Node(item=data)
        if self.isEmpty():
            self.start=n
        else:
            self.start.prev=n
            n.next=self.start

            self.start=n
            

    def insertAtlast(self,data):
        n=Node(item=data)
        temp=self.start
        while temp.next is not None:
            if temp.next ==None:
                temp.next=n
                n.prev=temp
            temp=temp.next

            
    def Printing(self):
        temp=self.start
        while temp is not None:
            print(temp.item,end=" ")
            temp=temp.next

DLL=DLL()
DLL.insertAtStart(5)
DLL.insertAtStart(4)
DLL.insertAtStart(7)
DLL.insertAtlast(8)
DLL.Printing()