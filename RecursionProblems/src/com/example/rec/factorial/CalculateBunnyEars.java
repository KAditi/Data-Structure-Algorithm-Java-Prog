package com.example.rec.factorial;

/*
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 */
public class CalculateBunnyEars {

	public int calBunnyEars(int n){
		if(n==0)
			return 0;
		if(n%2 == 0)
			return 3 + calBunnyEars(n-1);
		else
			return 2 + calBunnyEars(n-1);
		//return -1;
	}
	public static void main(String[] args)
	{
		CalculateBunnyEars calEars = new CalculateBunnyEars();
		System.out.println("Ear of bunny"+calEars.calBunnyEars(4));
		
	}
}
