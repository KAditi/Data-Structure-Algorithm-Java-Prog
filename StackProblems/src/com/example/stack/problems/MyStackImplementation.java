package com.example.stack.problems;

public class MyStackImplementation {
	
	char[] stackArray;
	int top;
	int stackSize;
	
	public MyStackImplementation(int size)
	{
		stackSize = size;
		top = -1;
		stackArray = new char[stackSize];
	}
	
	public void push(char value)throws Exception
	{
		if(isStackFull())
			throw new Exception("Stack is full");
		this.stackArray[++top]=value;
			
	}
	
	public char pop()throws Exception
	{
		if(isStackEmpty())
			throw new Exception("Stack is Empty");
		char temp = stackArray[top];
		top--;
		return temp;
	}
	
	public char peek() throws Exception
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
	public static void main(String[] args)
	{
		MyStackImplementation object = new MyStackImplementation(10);
		System.out.println("Reverse \t"+object.reverseWordStack("Reverse"));	
		MyStackImplementation expr = new MyStackImplementation(1);
		System.out.println("a*(b+c):\t"+expr.expressionMatching("a*(b+c)"));
	}
	
	public String reverseWordStack(String inputStr)
	{
		char[] charArray = inputStr.toCharArray();
		StringBuilder sb = new StringBuilder();
		MyStackImplementation obj = new MyStackImplementation(charArray.length);
		try{
			for(int i=0;i<charArray.length;i++)
			{
				obj.push(charArray[i]);
			}
			while(!obj.isStackEmpty())
			{	
				sb.append(obj.pop());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public boolean expressionMatching(String expression)
	{
		MyStackImplementation expMatch = new MyStackImplementation(expression.length());
		try{
		for(int i=0;i< expression.length();i++)
		{
			char ch = expression.charAt(i);
			switch(ch)
			{
			case '(':
			case '{':
			case '[':
				expMatch.push(expression.charAt(i));
				break;
			case ')':
			case '}':
			case ']':
				if(!expMatch.isStackEmpty())
				{
					char topChar = expMatch.pop();
					if((ch == ')' && topChar != '(')||(ch == '}' && topChar != '{')||(ch == ']' && topChar != '['))
					{
						System.out.println("Mismatch found: " + ch + " at " + i);
                        return false;
					}			
				}
				else
					return false;
				
				break;
			default: break;
			}
		}
		
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		if(!expMatch.isStackEmpty())
		{
			return false;
		}
		return true;
		
	}	
}
