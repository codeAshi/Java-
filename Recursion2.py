def call(n):
    if n==1:
        return 1
    s=n+call(n-1)
    return s

c=call(int(input()))
print(c)
