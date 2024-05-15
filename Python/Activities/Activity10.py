# Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
input_as_string1 = input("Enter your list of no.s with a comma to divide by 5: ")
print("User input as string: "+str(input_as_string1))

#convert string to tuple
tuple1=tuple(map(int,input_as_string1.split(",")))
print("Tuple converted from string: "+str(tuple1))
print("No.s divisible by 5 are: ")
for num in tuple1:
    if num % 5 == 0:
        print(str(num))




