class Node:
    def __init__(self,item=None,next=None):
        self.item=item
        self.next=next

class SinglyList:
    def __init__(self,start=None):
        self.start=start
    def isEmpty(self):
        return  self.start==None
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
    def search(self,data):
        if not self.isEmpty():
            temp=self.start
            while temp is not None:
                if temp.item==data:
                    return temp
                temp=temp.next
            return None
        
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
    def PrintList(self):
        temp=self.start
        while temp is not None:
            print(temp.item,end=" ")
            temp=temp.next
    def counting(self):
        count=0
        temp=self.start
        while temp is not None:
            count +=1
            temp=temp.next
        print("\ncount of nodes in list is:",count)
                   
#driver code
mylist=SinglyList()
mylist.insertAtStart(20)
mylist.insertAtStart(10)
mylist.insertAtLast(30)
mylist.insertAtLast(55)
mylist.insertAfter(10,15)
mylist.insertAfter(44,50)
mylist.search(30)
mylist.PrintList()
mylist.counting()  

