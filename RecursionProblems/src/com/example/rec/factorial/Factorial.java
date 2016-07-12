package com.example.rec.factorial;

public class Factorial {
	
	public int calFactorial(int n)
	{
		if(n==0)
			return 1;
		else
			return calFactorial(n-1)*n;
	}
	
	public static void main(String[] args)
	{
		Factorial calFact = new Factorial();
		System.out.println("Cal:"+calFact.calFactorial(4));
		
	}

}
