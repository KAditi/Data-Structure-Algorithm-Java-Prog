package com.example.linear.search;

public class LinearSearch {
	
	public int searchValue(int[] array, int value)
	{
		for(int i=0;i< array.length;i++)
		{
			if(array[i] == value)
			{
				return i;
			}			
		}
		return -1;
		
	}
	
	public static void main(String[] args)
	{
		LinearSearch object = new LinearSearch();
		int result = object.searchValue(new int[]{1,4,2,3,5,6},9);
		if(result != -1)
		{
			System.out.println("Value found at index:\t"+result);
		}
		else
		{
			System.out.println("Value not found");
		}
	}

}
