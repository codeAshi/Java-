class node:
    def __init__(self,prev=None, item=None, next=None):
        self.prev=prev
        self.item=item
        self.next=next
class DLL:
    def __init__(self,start=None):
        self.start=start
    def isEmpty(self):
        if self.start is None:
            return self.start is None
    def insertAtStart(self, data):
        n=node(None,data,self.start)
        if not self.isEmpty():
            self.start.prev=n
        self.start=n
        
     
    def printList(self):
        temp=self.start
        while temp is not None:
            print (temp.item,end ="   ")
            temp=temp.next   
    def insertBefore(self,prev,data): 
        temp=self.start
        while temp is not None:
            if  temp.item==prev:
                n=node(temp.prev, data, temp)
                if temp.prev is not None:
                    temp.prev.next=n
                temp.prev=n
                return
            temp=temp.next

    def delete(self,data):#only for middle nodes
        if not self.isEmpty():
            temp=self.start
           
            if self.start.item==data:
                self.start=self.start.next
                self.start.prev=None
                return
           
            while temp is not None:
                if temp.item==data:
                    temp.prev.next=temp.next
                    temp.next.prev=temp.prev
                    return  
                if temp.prev is not None and temp.item==data:
                    temp.prev.next=temp.next
                temp=temp.next
            

    def search(self,data):
        temp=self.start
        while temp is not None:
            if temp.item==data:
                print(f"Node you are searching for {data} is found ")
                return
            temp=temp.next
        print("Node not Fount")
    def insertAfter(self,temp,data):
        if temp is not None:
            n


        

        
            
ex=DLL()
ex.insertAtStart(10)
ex.insertAtStart(20)
ex.insertBefore(10,15)
ex.insertBefore(10,15)
ex.insertBefore(15,12)
#ex.delete(20)
ex.delete(10)
ex.search(15)

ex.printList()
