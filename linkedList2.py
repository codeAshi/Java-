class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next
class SinglyList:
    def __init__(self,start=None):
        self.start=start
        self.count=0

    def isEmpty(self):
        
        return self.start==None
        
    def add_element(self,data):
        n=Node(data,self.start)
        if self.isEmpty():
            self.start=n
        
    def insertAtLast(self,data):
        n=Node(data)
        temp=self.start
        while temp.next is not None:
            
           
            temp=temp.next
        temp.next=n
            

    def insertAtFirst(self,data):
        n=Node(data)
        n.next=self.start
        self.start=n


    def printing(self):
        temp=self.start
        while temp is not None:
            print(temp.item,end=" ")
            temp=temp.next

    def deleting(self,data):
        if data==self.start.item:
            self.start=self.start.next
        
        temp=self.start
        while temp.next is not None:

            if temp.next.item==data:
                temp.next=temp.next.next
            else:
                temp=temp.next



sll=SinglyList()
sll.add_element(3)
sll.insertAtLast(4)
sll.insertAtLast(5)
sll.insertAtFirst(2)
sll.printing()

sll.deleting(4)
print("\nAfter deleting Node")
sll.deleting(5)
sll.printing()
        