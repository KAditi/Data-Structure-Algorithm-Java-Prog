package com.example.stack.problems;

public class MyGenericStack<T extends Object> {
	
	T[] stackArray;
	int top;
	int stackSize;
	
	
	public MyGenericStack(int size)
	{
		stackSize = size;
		top = -1;
		stackArray = (T[])new Object[stackSize];
	}
	
	public void push(T value)
	{
		if(isStackFull())
			this.increaseStackCapacity();
		this.stackArray[++top]=value;
			
	}
	
	public T pop()throws Exception
	{
		if(isStackEmpty())
			throw new Exception("Stack is Empty");
		T temp = stackArray[top];
		top--;
		return temp;
	}
	
	public T peek() throws Exception
	{
		if(isStackEmpty())
			throw new Exception("Stack is Empty");
		return stackArray[top];
	}
	public boolean isStackFull()
	{
		return (top == stackSize-1);
	}
	public boolean isStackEmpty()
	{
		return (top == -1);
	}
	
	public void display()
	{
		System.out.println("Top"+top);
		for(int i=0;i<=top;i++)
		{
			System.out.print("\t"+stackArray[i]);
		}
	}
	
	private void increaseStackCapacity(){
        
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArray[i];
        }
        this.stackArray = newStack;
        this.stackSize = this.stackSize*2;
    }
     

}
