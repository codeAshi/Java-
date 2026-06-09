class Node:
    def __init__(self,left=None,item=None,right=None):
        self.left=left
        self.item=item
        self.right=right
class BST:

    def __init__(self):
        self.root=None
    def insert_Root(self,data):
        n=Node(item=data)
        self.root=n   # points the root Node

    def insert_Element(self,data):
        n=Node(item=data)
        temp=self.root
        while True:
            if data<temp.item:
                if temp.left is None:
                    temp.left=n
                    break
                temp=temp.left
            elif data>temp.item:
                if temp.right is None:
                    temp.right=n
                    break
                temp=temp.right

    def print_PostOrder(self,node):
        if node:
            print(node.item,end=" ")
            self.print_PostOrder(node.left)
            self.print_PostOrder(node.right)

    def printing(self):
        self.print_PostOrder(self.root)
        print()


    def DeleteBST(self,data):
        temp=self.root
        while True:
            pass
    def Min_Values_BSt(self):
        temp=self.root

        while temp.left is not None:    
            temp=temp.left
        return temp.item
    
    def Max_Values_BST(self):
        while self.root.right is not None:           # directly moving the __init__ root 
            self.root=self.root.right
        print(self.root.item)


B3=BST()
B3.insert_Root(60)
B3.insert_Element(70)
B3.insert_Element(25)
B3.insert_Element(40)
B3.insert_Element(67)
B3.insert_Element(90)
print("Here's is Binary Search Tree ")
B3.printing()
print("Min Values in tree: ",B3.Min_Values_BSt())
print("Max Values in tree: ")
B3.Max_Values_BST()
        


