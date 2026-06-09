class Node:
    def __init__(self,left=None,item=None,right=None):
        self.left=left
        self.item=item
        self.right=right

class BST:
    def __init__(self):
        self.start=None

    def insertRoot(self,item):
        n=Node(item=item)
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


    def printInoder(self,node):
        if node:
            self.printInoder(node.left)
            print(node.item,end=" ")
            self.printInoder(node.right)

    def preorder(self,node):
        if node:
            print(node.item,end=" ")
            self.preorder(node.left)
            self.preorder(node.right)

    def postorder(self,node):
        if node:
            self.postorder(node.left)
            self.postorder(node.right)
            print(node.item,end=" ")
    def printBST(self):
        self.printInoder(self.start)
        print()
        self.preorder(self.start)
        print()
        self.postorder(self.start)
        print()
    def min(self,node):
        current=node
        while current.left is not None:
            current=current.left
        return current.item
        
    def max(self):
        current=self.start
        while current.right is not None:
            current=current.right
        return current.item
    
    def delete(self,data):
        self.start=self.rdelete(self.start,data)
        #return self.start.item

    def rdelete(self,root,data):
        if root is None:
            return None
        if data<root.item:
            root.left=self.rdelete(root.left,data)

        elif data>root.item:
            root.right=self.rdelete(root.right,data)

        else:
            if root.left is None:
                return root.right
            elif root.right is None:
                return root.left 
            root.item=self.min(root.right)
            root.right=self.rdelete(root.right,root.item)
        return root




B3=BST()
B3.insertRoot(50)
B3.insertElement(30)
B3.insertElement(40)
B3.insertElement(25)
B3.insertElement(20)
B3.insertElement(60)
B3.insertElement(70)
B3.insertElement(65)

B3.printBST()

#print(B3.min())
print(B3.max())
print(B3.delete(60))