class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next
class CLL:
    def __init__(self,last=None):
        self.last=last
    def isEmpty(self):
        return self.last is None
    def insertAtFirst(self,data):
        n=Node(data)
        if self.isEmpty():
            n.next=n
            self.last=n
        else:
            n.next=self.last.next
            self.last.next=n
    def insertAtLast(self,data):
        n=Node(data)
        n.next=self.last.next
        self.last.next=n
        self.last=n
        

    def delete(self,data):
        if not self.isEmpty():
            temp=self.last
            while True:
                if temp.next.item==data:
                    temp.next=temp.next.next
                    return
                temp=temp.next
        


    def printList(self):

        temp=self.last.next
        while True:
            print(temp.item,end=" ")
            temp=temp.next
            if temp==self.last.next:
                break
            
        print()
CLL=CLL()
CLL.insertAtFirst(10)
CLL.insertAtFirst(20)
CLL.insertAtFirst(30)
CLL.insertAtFirst(40)
CLL.insertAtLast(50)
CLL.insertAtLast(60)
CLL.insertAtLast(70)
CLL.delete(4)
CLL.printList()
