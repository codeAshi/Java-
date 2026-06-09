def call(n):
    if n==1:
        return 1
    s=call(n-1)
    print(s)
c=call(10)
print(c)
