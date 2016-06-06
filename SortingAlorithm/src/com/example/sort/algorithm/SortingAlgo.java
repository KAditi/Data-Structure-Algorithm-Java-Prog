package com.example.sort.algorithm;

public class SortingAlgo {

	public static void main(String[] args) {
		
		int[] inputArray = {3,1,6,2,4,6,4,9,10};
		SortingAlgo obj = new SortingAlgo();
		obj.bubbleSort(inputArray);
		obj.insertionSort(new int[]{3,1,6,2,4,6,4,9,10});
		obj.selectionSort(new int[]{3,1,6,2,4,6,4,9,10});
		obj.quickSort(inputArray);
		obj.printArray(inputArray, "Quick Sort");
		
	}
	
	public void bubbleSort(int[] inputArray)
	{
		for(int i=0;i<inputArray.length;i++)
		{
			for(int j=i ; j<inputArray.length;j++)
			{
				if(inputArray[i]>inputArray[j])
				{
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j]= temp;
							
				}
			}
		}
		printArray(inputArray, "Bubble Sort");
		
	}
	
	public void insertionSort(int[] inputArray)
	{
		int temp=0;
		for(int i=0;i<inputArray.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(inputArray[j]<inputArray[j-1])
				{
					temp = inputArray[j];
					inputArray[j]= inputArray[j-1];
					inputArray[j-1]=temp;
				}
			}
		}
		printArray(inputArray, "Insertion Sort");
	}
	
	public void selectionSort(int[] arrayToSort)
	{
		for(int i=0;i<arrayToSort.length;i++)
		{
			int position = i;
			for(int j=i+1;j<arrayToSort.length;j++)
			{
				if(arrayToSort[j]<arrayToSort[position])
					position = j;
			}
			int temp = arrayToSort[position];
			arrayToSort[position] = arrayToSort[i];
			arrayToSort[i] = temp;
		}
		printArray(arrayToSort, "Selection Sort");
		
	}
	public void printArray(int[] array, String typeSort)
	{
		System.out.println("\n "+typeSort);
		for(int m=0;m<array.length;m++)
		{
			System.out.print("\t"+array[m]);
		}
	}
	
	public void quickSort(int[] inputArray)
	{
		if(inputArray == null || inputArray.length == 0)
			return;
		quickSort(inputArray,0, inputArray.length-1);
	}
	public void quickSort(int[] inputArray,int start, int end)
	{
		int i = start, j = end;
		int pivot = inputArray[(start+end)/2];
		
		while(i<j)
		{
			while(inputArray[i]<pivot)
			{				
				i++;
			}
			while(inputArray[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				swap(inputArray,i,j);
				i++;
				j--;
			}
			if(start < j)
				quickSort(inputArray,start,j);
			if(i<end)
				quickSort(inputArray,i,end);
		}
		
		
	}
	
	public void swap(int[] inputArray,int i, int j)
	{
		int temp = inputArray[i];
		inputArray[i]=inputArray[j];
		inputArray[j]= temp;
	}
	
	
}
