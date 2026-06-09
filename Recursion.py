def call(n):
    if n==1:
        return n
    s=n+call(n-1)
    return s
calling=call(100)
print(calling)
