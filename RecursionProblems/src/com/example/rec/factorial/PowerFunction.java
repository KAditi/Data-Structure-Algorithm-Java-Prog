package com.example.rec.factorial;

public class PowerFunction {
	
	public int powerN(int base, int n) {
		  if(n==0)
		    return 1;
		  if(n == 1)
		    return base;
		  else
		    return base * powerN(base,n-1);
	}
	public static void main(String[] args)
	{
		PowerFunction calPow = new PowerFunction();
		System.out.println("Power:"+calPow.powerN(10,0));
	}

}
