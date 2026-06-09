class Ashish:
    Age=21  #instance class variable 
    def __init__(self,Salary=None,Location=None):
        self.salary=Salary
        self.Location=Location
    def setSalary(self,Salary):
        self.salary=Salary
    def setLocation(self,Location):
        self.Location=Location
    @classmethod   #class method
    def setAge(cls,Age):
        cls.age=Age
        print("Age set to "+str(cls.age))
    @staticmethod  #static method
    def setAge2(age):
        Ashish.Age=age

p1=Ashish(50000,"India")
p2=Ashish()
p2.setSalary(60000)
p1.setAge(30)
p2.setLocation("USA")
print("Salary--Age--Location") #INDEX for better readability
print(p1.salary,p1.age,p1.Location)
print(p2.salary,p2.Age, p2.Location)
#Without creating an object, we can set the class variable age
Ashish.setAge(29)