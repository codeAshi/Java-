class sol:
    def leef(self, n):
        if n<=0:
            return False
        while n%4==0:
            n=n//4
        return n==1

l=sol()
print(l.leef(15))  # Added print to see the result
