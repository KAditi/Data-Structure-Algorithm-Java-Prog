package com.example.binary.search;

import java.util.Arrays;

public class BinarySearchValue {
	
	public int binarySearchValueNonRec(int[] array,int value)
	{
		int start =0, end = array.length-1;		
		
		
		//Arrays.sort(array);
		while(start<=end){
			 int mid = (start + end) / 2;
	            if (value == array[mid]) {
	                return mid;
	            }
	            if (value < array[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
		}		
		return -1;		
	}
	
	public int binarySearchRec(int[] array, int start, int end, int value)
	{
		if(start< end)
		{
			int mid = (start+ end)/2;
			if(value < array[mid]){
				return binarySearchRec(array, start, mid, value);
			}
			else if(value > array[mid]){
				return binarySearchRec(array,mid+1, end, value);
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		BinarySearchValue object = new BinarySearchValue();
		int[] array = {2,3,4,5,7,8,10};
		int result = object.binarySearchRec(array,0, array.length,8);
		if(result != -1)
		{
			System.out.println("Value found at:\t"+result);
		}
		else
		{
			System.out.println("Value not found");
		}
		
		
		
	}

}
