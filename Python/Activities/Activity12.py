#Write a recursive function to calculate the sum of numbers from 0 to 10

def calculateSum(N):
    if N:
        return N + calculateSum(N-1)
    else:
        return 0

result=calculateSum(10)
print("Sum of N: " +str(result))