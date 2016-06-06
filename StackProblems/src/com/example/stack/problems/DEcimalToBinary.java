package com.example.stack.problems;

public class DEcimalToBinary {
	
	int[] stackArray;
	int top;
	int stackSize;
	
	public DEcimalToBinary(int size)
	{
		stackSize = size;
		top = -1;
		stackArray = new int[stackSize];
	}
	
	public void push(int value)throws Exception
	{
		if(isStackFull())
			throw new Exception("Stack is full");
		this.stackArray[++top]=value;
			
	}
	
	public int pop()throws Exception
	{
		if(isStackEmpty())
			throw new Exception("Stack is Empty");
		int temp = stackArray[top];
		top--;
		return temp;
	}
	
	public int peek() throws Exception
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
	
	public String convertDecToBinary(int number)
	{
		StringBuilder binaryStr = new StringBuilder();
		DEcimalToBinary object = new DEcimalToBinary(32);
		if(number == 0)
		{
			binaryStr.append("0");
		}
		try{
			while(number !=0)
			{
				object.push(number%2);
				number = number/2;
			}
			while(!object.isStackEmpty())
			{
				binaryStr.append(object.pop());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return binaryStr.toString();
		
	}
	
	public static void main(String[] args)
	{
		DEcimalToBinary obj = new DEcimalToBinary(0);
		System.out.println("23 :\t"+obj.convertDecToBinary(23));
	}
	

}
