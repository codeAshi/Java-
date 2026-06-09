class Node:
    def __init__(self, item=None,next=None):
        self.item=item
        self.next=next

class List:
    def __init__(self, Start=None):
        self.start=Start
    def isEmpty(self):
        if self.start is None:
            print("List is Empty")
   
    def insertAtStart(self,data):
        n=Node(data,self.start)
        self.start=n

    def insertAtLast(self,data):
        n=Node(data)
        if not self.isEmpty():
            temp=self.start
            while temp.next is not None:
                temp=temp.next
            temp.next=n
        else:
            self.start=n
        
    def printList(self):
        temp=self.start
        while temp is not None :
            print(temp.item,end="  ")
            temp=temp.next

    def count(self):
        count=0
        temp=self.start
        while temp is not None:
            count+=1
            temp=temp.next            
        print("\n",count)
     
    def insertAfter(self,tem,Data):
        temp=self.start
        while temp is not None:
            if temp.item==tem:
                
                n=Node(Data,temp.next)
                temp.next=n
                return
            temp=temp.next
        else:
            print("Node Not Found")
    def search(self,data):
        if not self.isEmpty():
            temp=self.start
            while temp is not None:
                if temp.item==data:
                    print(f"Node {data} found")
                    return 
                temp=temp.next 
            return None
    def delete(self,data):
        if self.start is None:
            pass 
        elif self.start.next is None:
            if self.start.item==data:
                self.start=None
        else:
            temp=self.start
            if temp.item==data:
                self.start=temp.next
            else:
                 while temp.next is not None:
                    if temp.next.item==data:
                        temp.next=temp.next.next
                        break
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



List=List()
List.insertAtStart(10)
List.insertAtStart(9)
List.insertAtStart(8)
List.insertAtStart(7)
List.insertAtLast(11)

List.insertAfter(10,12)
List.search(12)
List.printList()

List.delete(8)
print()
List.delete(7)
List.delete(11)
List.printList()
List.count()

for a in List:
    print(a,end=" ")