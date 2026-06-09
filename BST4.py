##This code is for Deletion in Binary search tree
class Node :
    def __init__(self,left=None,item=None,right=None):
        self.left=left
        self.item=item
        self.right=right

class Binary_Search_Tree:
    def __init__(self):
        self.root=None
    def INSERT_ROOT(self,DATA):
        n=Node(item=DATA)
        self.root=n
    def INSERT_ELEMENT(self,DATA):
        n=Node(item=DATA)
        temp=self.root
        while True:
            if DATA<temp.item:
                if temp.left is None:
                    temp.left=n
                    break
                temp=temp.left
            elif DATA>temp.item:
                if temp.right is None:
                    temp.right=n
                    break
                temp=temp.right
    def PRINT_INORDER(self,node):
        if node:
            self.PRINT_INORDER(node.left)
            print(node.item,end=" ")
            self.PRINT_INORDER(node.right)
    def PRINTING(self):
        self.PRINT_INORDER(self.root)
        print()
    def MIN_VALUE_BST(self):
        temp=self.root
        while temp.left is not None:
            temp=temp.left
        return temp.item
    def MAX_VALUE_BST(self):
        temp=self.root
        while temp.right is not None:
            temp=temp.right
        return temp.item

    def SEARCH_BST(self, data):
        temp = self.root
        while temp is not None:
            if temp.item == data:
                return "Node Found"
            elif data < temp.item:
                temp = temp.left
            else:
                temp = temp.right
        return "Node Not Found"
    def DELETE(self,data):
        temp=self.root 
        
        


B4=Binary_Search_Tree()
B4.INSERT_ROOT(70)
B4.INSERT_ELEMENT(60)
B4.INSERT_ELEMENT(50)
B4.INSERT_ELEMENT(75)
B4.INSERT_ELEMENT(90)
B4.PRINTING()
print(B4.SEARCH_BST(60))
print("Min Value In BST:",B4.MIN_VALUE_BST())
print("Max value In BST:",B4.MAX_VALUE_BST())

