class Stack:
    def __init__(self):
        self.item=[]
    def isEmpty(self):
        return len(self.item)==0
    def push(self,data):
        self.item.append(data)
    def pop(self):
        if not self.isEmpty():
            return self.item.pop()
        else:
            raise IndexError()  
    def peek(self):
        if not self.isEmpty():
            return self.item[-1]
        else:
            raise IndexError("Stack is Empty")
    def size(self):
        return len(self.item)
s1=Stack()
s1.push(10)
s1.push(20)
s1.push(30)
print(s1.peek())
s1.pop()
print(s1.peek())
        