class Node:
    def __init__(self,left=None,item=None,right=None):
        self.left=left
        self.item=item
        self.right=right

class BFS:
    def __init__(self,start=None):
        self.start=start


    def insertRoot(self,data):
        n=Node(item=data)
        self.start=n
    def insertAtLeft(self,data):
        if self.start is None:
            return
        Queue=[self.start]
        n=Node(item=data)
        self.start.left=n

    def printTree(self):
        temp=self.start
        while True:
            print(temp.item,end=" ")
            return
            #temp=temp.next

b1=BFS()
b1.insertRoot(30)
b1.insertAtLeft(20)
print(b1.printTree())
