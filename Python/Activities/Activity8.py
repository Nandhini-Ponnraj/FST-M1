# Given a list of numbers, return True if first and last number of a list is same.

ulist = list(input("Enter a list of numbers like 1 2 3 4: ").split(" "))
print(str(ulist))

if ulist[0] == ulist[len(ulist)-1]:
    print("First and Last no.s of the list are same")

else:
    print("First and Last no.s are different")