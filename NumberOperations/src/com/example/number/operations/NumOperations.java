package com.example.number.operations;

public class NumOperations {
	
	public static void main(String[] args)
	{
		NumOperations object = new NumOperations();
		object.dec2bin(5);
		object.isPerfectNumber(6);
		object.isPrime(12);
	}
	public void dec2bin(int input)
	{
		int[] binary = new int[32];
		int i=0;
		while(input>0)
		{
			binary[i++]= input%2;
			input = input/2;
			
		}
		for(int j=i-1; j>= 0;j--)
		{
			System.out.print(binary[j]);
		}		
	}
	
	public void isPerfectNumber(int input)
	{
		int sum=0;
		for(int i=1;i<=input/2;i++)
		{
			if(input%i == 0)
			{
				sum+= i;
			}
		}
		if(sum == input)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
			
			
	}
	public void isPrime(int number)
	{
		boolean flag = false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				flag = false;
			}
			else
				flag = true;
		}
		if(flag)
			System.out.println("Number is  prime");
		else
			System.out.println("Number is not prime");
	}
}
