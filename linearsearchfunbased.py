lst=[]

def insert(lst,a):
    lst.append(a)

#write code for prompting user to enter num
def usrinsert(lst):
    a=int(input("Enter num:"))
    lst.append(a)

insert(lst,5)
usrinsert(lst)
    
print(lst)
