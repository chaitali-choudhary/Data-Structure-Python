class Stack:

    def __init__(self,size):
        global arr
        arr=[0,0,0,0,0]
        global top
        top=-1
        global capacity
        capacity=size
        print("Value of top:", top)

    def push(self,x,top):
        if top==capacity-1:
            print("OverFlow")
        else:
            print("Inserting ", x)
            arr[top+1] = x
            top=top+1
            print("Value of top:", top)
        return top

    def pop(self,top):
        if top==-1:
            print("UnderFlow")
        else:
            print("Removing " , peek())
            return arr[top]
            top=top-1
        return top

    def peek(self):
        if top!=-1:
            return arr[top]
        else:
            return -1

    def size(self):
    	return top + 1
    

stack = Stack(3)
stack.push(1,top)		
stack.push(2,top)		
stack.pop(top)		
stack.pop(top)		
stack.push(3,top)		
print("Top element is: " ,stack.peek())
print("Stack size is " ,stack.size())
stack.pop(top)	    
