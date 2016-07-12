package com.example.inc.dec.pattern;
/*
 * If n =16
 * Output : 16, 11, 6, 1, -4, 1, 6, 11,16
 */
public class PrintPattern {
	
	public void printPattern(int n)
	{
		if(n == 0 || n< 0)
		{
			System.out.print("\t"+n);
			return;
		}
		System.out.print("\t"+n);
		printPattern(n-5);
		System.out.print("\t"+n);
	}
	public static void main(String[] args)
	{
		PrintPattern object = new PrintPattern();
		object.printPattern(16);
	}

}
