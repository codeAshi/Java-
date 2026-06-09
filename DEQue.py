#insert and deletion From Both Ends 

class deque:
    def __init__(self):
        self.item=[]

    def isEmpty(self):
        return len(self.item)==0
    
    def insertFront(self,data):
        self.item.insert(0,data)

    def insertLast(self,data):
        self.item.append(data)
    
    def front(self):
        return self.item[0]
    
    def removeFront(self):
        if not self.isEmpty():
            self.item.pop(0)

    def removeLast(self):
        if not self.isEmpty():
            self.item.pop()
        
    def last(self):
        return self.item[-1]
    
q3=deque()
q3.insertFront(10)
q3.insertFront(20)
q3.insertFront(30)
q3.insertLast(40)
print("Current Front Element :",q3.front())
q3.removeFront()
print("Current Front Element :",q3.front())
print("Current Last Elements :",q3.last())
q3.removeLast()
print("Current Last Elements :",q3.last())

