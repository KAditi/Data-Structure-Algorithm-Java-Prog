package com.eample.array.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

public class ArraysProb {

	public static void main(String[] args) {
		
		ArraysProb arrayProb = new ArraysProb();
		arrayProb.findMissingNumber();
		arrayProb.findMoreThanOneMissing(new int[]{1,2,3,6,7,8},8);
		arrayProb.compareTwoArray(new int[]{1,2,3,4,5},new int[]{2,3,1,0,5});
		arrayProb.findPairForSum(new int[] {2,3,1,0,5,10,-5}, 5);
		arrayProb.removeDuplicate(new int[] {1,4,2,3,2,5,5,5});
		arrayProb.largestSmallestNum(new int[] {1,4,2,3,2,5,5,5});
		arrayProb.twoMaximumValue(new int[]{2,5,1,7,2,4,9,10,28,28});
		
	}
	
	public void findMissingNumber()
	{
		int[] inputArray = new int[100];
		int finalSum=0, arraySum=0;
		for(int i=1;i<=100;i++)
		{
			finalSum+= i;
			if(i==9)
			{
				inputArray[i-1]=0;
			}
			else
			{	
				inputArray[i-1]=i;
			}
		}
		for(int i=0;i<inputArray.length;i++)
		{
			arraySum+=inputArray[i];
		}
		System.out.println("Missing number is :\t"+(finalSum-arraySum));
	}
	
	public void findMoreThanOneMissing(int[] arrayIp, int count)
	{
		int missingCount = count - arrayIp.length;
		BitSet bitSet = new BitSet(count);
		
		for(int i=0;i<arrayIp.length;i++)
		{
			bitSet.set(arrayIp[i]-1);
		}
		
		int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
	}
	
	public void compareTwoArray(int[] second, int[] first)
	{
		HashMap<Integer,Integer> firstMap = new HashMap<Integer,Integer>();
		List<Integer> test = new ArrayList<Integer>();
		
		for(int i=0;i<first.length;i++)
		{
			if(firstMap.containsKey(first[i]))
			{
				firstMap.put(first[i],firstMap.get(first[i])+1);
			}
			else
			{
				firstMap.put(first[i],1);
			}			
		}
		for(int j=0;j<second.length;j++)
		{
			if(!firstMap.containsKey(second[j]))
			{
				System.out.println("Second array doesn't has value:\t"+second[j]);
			}
		}
	}
	
	public void findPairForSum(int[] inputArray, int sum)
	{
		for(int i=0;i<inputArray.length;i++)
		{
			for(int j=i+1;j<inputArray.length;j++)
			{
				if(inputArray[i]+inputArray[j] == sum)
				{
					System.out.println("Pair:\t ("+inputArray[i]+","+inputArray[j]+")");
				}
			}
		}
	}
	
	public void removeDuplicate(int[] inputArray)
	{
		int[] result = new int[inputArray.length];
		Arrays.sort(inputArray);
		int j=0;
		for(int i=0;i<inputArray.length;i++)
		{
			if(result[j]!= inputArray[i])
			{
				j++;
				result[j]= inputArray[i] ;
			}
			else
				continue;
		}
		System.out.println("");
		
		for(int i=0;i<result.length;i++)
		{
			
			System.out.print("\t"+result[i]);
		}
		System.out.println("");
	}
	
	public void largestSmallestNum(int[] inputArray)
	{
		Arrays.sort(inputArray);
		System.out.println("Smallest Element:\t"+inputArray[0]);
		System.out.println("Largest Element: \t"+inputArray[inputArray.length-1]);
	}
	public void twoMaximumValue(int[] inputArray)
	{
		Arrays.sort(inputArray);
		int max = inputArray[inputArray.length-1];
		for(int i=inputArray.length-1;i>=0;i--)
		{			
			if(inputArray[i]!=max)
			{
				System.out.println("Two max numbers: \t "+max+"\t"+inputArray[i]);
				break;
			}
		}
	}
}
