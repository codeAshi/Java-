#s=input("Enter A String ")

newLine=","
new="."
d="Dear Ashish, hello this is ananya this side. Hope .You're Doing .great i want know .more about youre profil.Thanks"
count=0
for i in range(len(d)-6):
    if d[i]==newLine:
        print(d[i],end="")
        print()
    else:
        print(d[i],end="")
print()
print(d[-6:])
