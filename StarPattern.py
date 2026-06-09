n=6
"""
for i in range(1,n+1):
    print(i*"*",end="")
    spaces=2*(n-i)
    print(spaces*" ",end="")
    print(i*"*")
    """

for i in range(1,n+1):
    print(i*" ","*",end="")
    space=2*(n-i)
    print(space*" ",end="")

    print("*",end="")
    print(i*" ",end="")
    s2=i
    print(s2*" ",end="")
    print("*",end="")
    print(space*" ",end="")
    print("*")

for i in range(n,0,-1):
    space=i+1
    print(space*" ",end="")
    print("*")
    
    


    