import pandas as pd
from pandas import DataFrame

creds = pd.read_csv("C:/Users/003SVN744/IdeaProjects/FST_Python/inputs/Creds.csv")
print(creds)
print("Printing the values in Username column: " + creds["usernames"])
print("Printing the Username & Password of 2nd row: " + creds["usernames"][1] + " " + creds["passwords"][1])
print("Sort the Usernames column data in ascending order")
print(creds.sort_values('usernames', ascending=True))
print("Sort the Passwords column in descending order")
print(creds.sort_values('passwords', ascending=False))
