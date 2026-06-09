class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next
class LinkedList:
    def __init__(self,start=None):
        self.start=start
    def isEmpty(self):
        if self.start ==None:
            return self.start is None
    def insertAtFirst(self,data):
        n=Node(data,self.start)
        self.start=n
    def insertAtLast(self,data):
        n=Node(data)
        temp=self.start
        while temp.next is not None:
            temp=temp.next
        temp.next=n
    def deleteFirst(self,data):
        if not self.isEmpty():
            if self.start.item==data:
                self.start=self.start.next
    def deleteLast(self,data):
        temp=self.start
        while temp.next is not None:
            if temp.next.item==data:
                temp.next=None
                return
            temp=temp.next
    def search(self,data):
        temp=self.start
        while temp.next is not None:
            if temp.item==data:
                print(f"Node Found {data}")
            else:
                print(f"Node {data} Not exits In Linked List")
            temp=temp.next
                
            
    def insertAfter(self,tem,data):
        
        temp=self.start
        while temp.next is not None:
            if temp.item==tem:
                n=Node(data,temp.next)
                temp.next=n
                
            temp=temp.next


    def printList(self):
        temp=self.start
        while temp is not None:
            print(temp.item,end=" ")
            temp=temp.next
    def __iter__(self):
        return iterator(self.start)
class iterator:
    def __init__(self,start):
        self.current=start
    def __iter__(self):
        return self

    
    def __next__(self):
        if not self.current:
            raise StopIteration
        data=self.current.item
        self.current=self.current.next

        return data


Linked=LinkedList()
Linked.insertAtFirst(10)
Linked.insertAtFirst(20)
Linked.insertAtFirst(30)
Linked.insertAtLast(50)
Linked.insertAtLast(60)
Linked.deleteFirst(30)

Linked.deleteLast(60)
Linked.deleteLast(50)
Linked.search(20)
Linked.search(50)
Linked.insertAfter(20,30)
Linked.printList()
print()
for x in Linked:
    print(x,end="\n")