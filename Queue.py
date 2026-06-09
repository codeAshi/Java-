class queue:
    def __init__(self):
        self.item=[]
    def isEmpty(self):
        return len(self.item)==0
    def push(self,data):
        self.item.append(data)
    def pop(self):
        if not self.isEmpty():
            return self.item.pop(0)
        else:
            return IndexError("Queue is Empty ")
    def size(self):
        return len(self.item)    
    def peek(self):
        return self.item[-1]
q1=queue()
q1.push(10)
q1.push(20)
q1.push(30)
q1.push(40)
print("Removed element from queue :",q1.pop())
print("Removed element from queue :",q1.pop())
print("Current size of Queue :",q1.size())
print(q1.peek())
