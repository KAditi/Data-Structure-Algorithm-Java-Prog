package com.example.print.sequence;

import java.util.ArrayList;
import java.util.List;

public class PrintNumberSeq {
	
	public static void printNonIncSeq(int remaining,int maxAllowed,List<Integer> numbers){
		if(remaining==0){
			for(Integer i:numbers)System.out.print(i+" ");
			System.out.println();
		}
		if(remaining<maxAllowed)maxAllowed=remaining;
		for(int loop1=maxAllowed;loop1>=1;loop1--){
			numbers.add(loop1);
			printNonIncSeq(remaining-loop1, loop1, numbers);
			numbers.remove(numbers.size()-1);
		}
	}
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		printNonIncSeq(10,10,numbers);
	}

}
