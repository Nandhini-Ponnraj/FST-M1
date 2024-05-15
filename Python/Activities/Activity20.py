import pandas as pd
from pandas import DataFrame

df = pd.read_excel("C:/Users/003SVN744/IdeaProjects/FST_Python/inputs/excel1.xlsx", engine='openpyxl')
print("Print the number of rows and columns:")
print(df.shape)
print("Data in email column:")
print(df['Email'])
print("Sorting the data based on First name in ascending order")
print(df.sort_values('FirstName'))