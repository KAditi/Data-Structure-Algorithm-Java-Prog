package com.interview.que.sort;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		
		int[] A = {2,3,6,5,4,1,7};
		int k=3, n=A.length;
		int[] B = new int[n-k];
		int min = Integer.MIN_VALUE;
		for(int i=0;i<n-k;i++)
		{
			
			 min = A[i];
			for(int j=i;j<i+k;j++)
			{
				if(A[j]< min)
				{
					min = A[j];
				}
			}
			B[i] = min;
			
		}
		System.out.println("B print");
		for(int i=0; i< B.length;i++)
			System.out.print("\t"+B[i]);
		
	}
	
	public static int findMin(int[] funArray,int start,int end)
	{
		int min = Integer.MAX_VALUE;
		for(int i=start;i<end;i++)
		{
			if(funArray[i]< min)
			{
				min = funArray[i];
				
			}
		}
		return min;
		
	}
}
