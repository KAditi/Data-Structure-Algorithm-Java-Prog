package com.example.reverse.array;

public class ReverseArr {
	
	public void reverseArray(int[] array)
	{
		int[] temp = new int[array.length];
		int length= array.length-1;
		int k=0;
		for(int j=length ;j>= 0;j--){
			temp[k]=array[j];
			k++;
		}
		for(int i=0;i<array.length;i++)
			System.out.print("\t"+temp[i]);
	}
	
	public static void main(String[] args)
	{
		ReverseArr inputArray = new ReverseArr();
		int[] array = new int[]{1,2,3,4,5,6};
		inputArray.reverseArray(array);
	}

}
