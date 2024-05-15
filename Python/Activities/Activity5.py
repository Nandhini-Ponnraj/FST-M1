# Multiplication table using loop

Number = int(input("Enter a number to multiply: "))
print("Multiplication from 1 to 10 for "+ str(Number) + " :")
multiply=[1,2,3,4,5,6,7,8,9,10]
for n in multiply:
    print(" " + str(Number) + " * " + str(n) + " = " + str(Number*n))