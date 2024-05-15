#sum of numbers
userinput = list(input("Enter a list of numbers that you want to sum up like 1 2 3 4: ").split(" "))
print("Your list: " + str(userinput))

total=0
for n in userinput:
    total += int(n)


print("Sum of your list of numbers: " + str(total))