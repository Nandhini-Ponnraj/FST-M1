import pandas as pd
from pandas import DataFrame

data ={
    "usernames":["Admin","Charles","Deku"],
    "passwords":["password","Charl13","ALLMIGHT"]
}

df=DataFrame(data)
print(df)
df.to_csv("C:/Users/003SVN744/IdeaProjects/FST_Python/inputs/Creds.csv")
print("File created successfully")
creds=pd.read_csv("C:/Users/003SVN744/IdeaProjects/FST_Python/inputs/Creds.csv")
print(creds)