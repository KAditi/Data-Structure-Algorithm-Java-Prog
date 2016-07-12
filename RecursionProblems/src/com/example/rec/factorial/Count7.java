package com.example.rec.factorial;

public class Count7 {
	
	public int count7(int n)
	{
		
		if(n==7)
		    return 1;
		if(n == 0)
			return 0;
		 if(n%10 == 7)
		    return 1+count7(n/10);
		  else 
		    return count7(n/10);
		  
	}
	public static void main(String[] args)
	{
		Count7 count = new Count7();
		System.out.println("Count:\t"+count.count7(7246));
	}

}
