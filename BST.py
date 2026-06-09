class Node:
    def  __init__(self,left=None,item=None,right=None):
        self.left=left
        self.item=item
        self.right=right
    
class BST:
    def __init__(self):
        self.start=None
    def insertroot(self,item):
        n=Node(None,item,None)
        self.start=n
    
    def insertElement(self,data):
        n=Node(item=data)
        temp=self.start
        while True:
            if data<temp.item:
                if temp.left is None:
                    temp.left=n
                    break
                temp=temp.left
            else:
                
                if data>temp.item:
                    if temp.right is None:
                        temp.right=n
                        break
                temp=temp.right
 
    def printInorder(self,node):
        if node:
            self.printInorder(node.left)
            print(node.item,end=" ")
            self.printInorder(node.right)
              #return self.inorderTraversal(root.left)+[root.val]+self.inorderTraversal(root.right)
     
    def printBST(self):
        self.printInorder(self.start)
        print()

    def search(self,data):
        temp=self.start
        while temp is not None:
            if data==temp.item:
                print("Node found")
                return
            elif data<temp.item:
                temp=temp.left
            else:
               
                temp=temp.right
        print("Node Not found")


    def remove(self,data):
        temp=self.start
        while temp is not None:
            if temp.item==data:
                return





        """
    def removeElement(self,data):
        temp=self.start
        while temp is not None:
            if data==temp.item:
                temp.item=None
                return

            elif data<temp.left:
                temp=temp.left
            else:
                temp=temp.right
"""
b1=BST()
b1.insertroot(50)
b1.insertElement(40)
b1.insertElement(30)
b1.insertElement(60)
b1.insertElement(70)
b1.search(70)

b1.printBST()
#b1.removeElement(70)
b1.printBST()