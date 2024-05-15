#Write a function sum() such that it can accept a list of elements and print the sum of all elements

def calculateSum(li):
    x = 0
    for n in li:
        x = x + n
    return x


sum1 = calculateSum([1, 2, 3])
print("Sum of the list of elements is:" +str(sum1))
