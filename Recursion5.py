def sum(n):
    if n==100:
        return n
    s=n+sum(n+1)
    return s
obj=sum(1)
print(obj)