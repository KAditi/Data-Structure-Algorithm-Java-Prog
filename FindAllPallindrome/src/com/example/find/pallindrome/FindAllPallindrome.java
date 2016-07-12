package com.example.find.pallindrome;

public class FindAllPallindrome {

	public void findPallindrome(String input)
	{
		if(input == null)
			return;
		else if(input.length() == 1){
			System.out.println("\t"+input);
			return;
		}
		else
		{
			System.out.print("\t"+input);
			System.out.println("");
			findPallindrome(input.substring(1,input.length()-1));
		}
	}
	
	public static void main(String[] args)
	{
		FindAllPallindrome object = new FindAllPallindrome();
		object.findPallindrome("nitin");
	}
}
