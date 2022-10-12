a=[]
n=5
top=None
def push(item):
    global top,a
    if top==None:
        top=0
        a.append(item)
        print(a)
        return
    
    elif top>n:
        print("Overflow")
        print(a)
        return
    
    else:
        top=top+1
        a.append(item)
        print(a)
        


def pop():
    global top,a
    if top==None:
        print("Underflow")
    elif top==0:
        print("Element popped is:",a[top])
        top=None
        return int(a[0])
    else:
        print("Element popped is:",a[top])
        top=top-1
        return int(a[top+1])

def evaluate(expr):
        for i in expr:
            if i in '0123456789':
                push(i)
            else:
                op1=pop()
                op2=pop()
                result=cal(op2,op1,i)
                print("Result is:",result)
        #return pop()

def cal(op2,op1,i):
        if i == '*':
            return int(op2)*int(op1)
        elif i == '/':
            return int(op2)/int(op1)
        elif i == '+':
            return int(op2)+int(op1)
        elif i == '-':
            return int(op2)-int(op1)

evaluate("26+")
