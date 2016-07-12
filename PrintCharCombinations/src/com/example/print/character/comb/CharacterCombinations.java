/*
 * Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.
 */
package com.example.print.character.comb;

public class CharacterCombinations {

	public void printAllCombinations(char[] input, String prefix, int n, int k)
	{
		if(k == 0)
		{
			System.out.println(prefix);
			return;
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				String newPref = input[i]+prefix;				
				printAllCombinations(input, newPref, n, k-1);
			}
		}
	}
	
	public static void main(String[] args)
	{
		CharacterCombinations object = new CharacterCombinations();
		char[] set = {'a', 'b'};
		object.printAllCombinations(set, "", set.length,3);
		
	}
}
