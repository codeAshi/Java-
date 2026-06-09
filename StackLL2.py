class stack:
    def __init__(self):
        self.item=[]
    def isEmpty(self):
        return len(self.item)==0
    def Push(self,data):
    
        self.item.append(data)
    

    def Pop(self):
        if not self.isEmpty():

            self.item.pop()
        else:
            raise IndexError("List is Empty")
    
    def peek(self):
        if not self.isEmpty():

            return self.item[-1]
        else:
            raise IndexError("List is Empty")


s2=stack()
s2.Push(10)
s2.Push(20)
s2.Push(30)
s2.Push(40)
s2.Pop()
print(s2.peek())


