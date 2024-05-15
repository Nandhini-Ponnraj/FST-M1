import pandas as pd
from pandas import DataFrame, ExcelWriter

data= {
    "FirstName": ['Satvik', 'Avinash', 'Lahri'],
    "LastName": ['Shah','Kati','Rath'],
    "Email":['satshah@example.com','avinashk@example.com','lahri.rath@example.com'],
    "PhoneNumber":['4537829158','5892184058','4528727830']
}
df = DataFrame(data)
print(df)
writer= ExcelWriter("C:/Users/003SVN744/IdeaProjects/FST_Python/inputs/excel1.xlsx")
df.to_excel(writer, "Sheet1", index = False)
print("File created successfully")
writer.close()