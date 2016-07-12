package com.example.rec.factorial;

public class CountHi {
	
	public int countX(String str)
	{
		if(str == null || str == "")
			return 0;
		else if(str.length() == 1 && str.contains("hi") )
			return 1;
		else if(str.length() ==1 && !str.contains("hi"))
			return 0;
		else if(str.contains("hi"))
			return 1+ countX(str.substring(0,str.length()-1));
		else
			return 0+ countX(str.substring(0,str.length()-1));
			
	}
	

}
