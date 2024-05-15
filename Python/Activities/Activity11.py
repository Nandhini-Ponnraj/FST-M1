#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.
fruits = {
    "1": "apple",
    "2": "banana",
    "3": "mango",
    "4": "kiwi",
    "5": "strawberry"
}
choice= input("Enter your fruit choice:").lower()
if choice in fruits.values():
    print("Your choice of fruit " +str(choice) +" is available")
else:
    print("Your choice of fruit " +str(choice) +" is not available")