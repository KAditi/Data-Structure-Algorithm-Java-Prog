package com.example.unique.number;

import java.util.HashMap;
import java.util.Random;

public class UniqueNumber {

	public void returnUniqueNumber(int n,int m)
	{
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		int i=0;
		while(i<n)
		{
			int temp = 0+(int) (Math.random()* 20);
			if(temp>=0 && temp < m)
			{
				if(!hashMap.containsKey(temp))
				{
					hashMap.put(temp,1);
					i++;
				}
			}
		}
		for(Integer key: hashMap.keySet())
		{
			System.out.print("\t"+key.intValue());
		}
		
	}
	
	public static void main(String[] args)
	{
		UniqueNumber findUniNum = new UniqueNumber();
		//findUniNum.returnUniqueNumber(5,1500);
		int[] inputArray = new int[]{2,3,5,2,5,6,7,2,4};
		findUniNum.findRandomNumbers(inputArray, 3);
	}
	
	public void findRandomNumbers(int[] inputArray, int count)
	{
		int max = inputArray.length;
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		int i=0;
		while(i<count)
		{
			Random rn = new Random();
			int position = rn.nextInt()%2+i;
			if(position>=0 && position < max)
			{
				if(!hashMap.containsKey(inputArray[position]))
				{
					hashMap.put(inputArray[position],1);
					i++;
				}
			}
		}
		for(Integer key: hashMap.keySet())
		{
			System.out.print("\t"+key.intValue());
		}
	}
	
}
