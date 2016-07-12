package com.example.rec.factorial;

public class OcuuranceOfChar {
	public int countX(String input)
	{
		input.replace('x','y');
		if(input == null || input == "")
			return 0;
		else if(input.length() == 1 && input.contains("x") )
			return 1;
		else if(input.length() ==1 && !input.contains("x"))
			return 0;
		else if(input.contains("x"))
			return 1+ countX(input.substring(0,input.length()-1));
		else
			return 0+ countX(input.substring(0,input.length()-1));
			
	}
	
	public static void main(String[] args)
	{
		OcuuranceOfChar object = new OcuuranceOfChar();
		System.out.println("count x:\t"+object.countX(""));
	}

}
