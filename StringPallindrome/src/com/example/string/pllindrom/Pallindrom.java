package com.example.string.pllindrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Pallindrom {
	
	public static void main(String[] args) {
		
		Pallindrom object = new Pallindrom();
		System.out.println("Input String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = false;
		
		try {
			String input = br.readLine();
			System.out.println("Enter Character");
			flag = object.checkPallindrom(input);
			String answer = object.removeChar("aditi", 't');
			object.permutationsString("","123");
			object.firstNonRepeatedChar("ssmkl");
			object.findOccuranceOfChar("test",'t');
			boolean isAnagram = object.checkAngram("test","tse");
			object.convertStringToInt("123");
			String reverse = object.reverseRec("aditi");
			System.out.println("Rverese String Recursive:\t"+reverse);
			String reverseVowel = object.reverseVowels("hello");
			System.out.println("Reverse Vowel:\t"+reverseVowel);
			if(isAnagram)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
			if(flag)
			{
				System.out.println("String is pallindrom");
			}
			else
			{
				System.out.println("String is not pallindrom");
			}
			System.out.println("String got after removing:\t"+answer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkPallindrom(String ip)
	{
		boolean flag =false;
		char[] charArray = ip.toCharArray();
		int j = charArray.length - 1;
		for(int i = 0;i< charArray.length;i++)
		{
			if(charArray[i] == charArray[j])
			{
				flag = true;
				j--;
			}
			else
			{
				flag = false;
				j--;
			}
		}
		return flag;
		
		
	}
	
	public String removeChar(String ip, char c)
	{
		char[] charArray = ip.toCharArray();
		String answer = "";
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i] != c)
			{
				answer = answer + String.valueOf(charArray[i]);
			}
						
		}
		if(answer.endsWith(ip))
		{
			return ip;
		}
		else{		
		return answer;
		}
	}
	public void permutationsString(String perm, String ip)
	{
		if(ip.isEmpty())
		{
			System.out.println(perm+ip);
		}
		for(int i=0;i<ip.length();i++)
		{
			permutationsString(perm+ip.charAt(i),ip.substring(0,i)+ip.substring(i+1,ip.length()));
		}
		
	}
	
	public void firstNonRepeatedChar(String ip)
	{
		char[] charArray = ip.toCharArray();
		HashMap<Character,Integer> hashMap = new HashMap();
		
		for(int i=0;i<charArray.length ;i++)
		{
			if(hashMap.containsKey(charArray[i]))
			{
				hashMap.put(charArray[i],hashMap.get(charArray[i])+1);
			}
			else
			{
				hashMap.put(charArray[i],1);
			}
		}
		for(int i=0;i<charArray.length;i++)
		{
			if(hashMap.get(charArray[i])==1)
			{
				System.out.println("First non repetable character:\t"+charArray[i]);
				break;
			}
		}
		
		
	}
	
	public void findOccuranceOfChar(String ip, char c)
	{
		char[] charArray = ip.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(int i=0;i<charArray.length;i++)
		{
			if(hashMap.containsKey(charArray[i]))
			{
				hashMap.put(charArray[i],hashMap.get(charArray[i])+1);
			}
			else
			{
				hashMap.put(charArray[i],1);
			}
		}
		
		System.out.println("Character:\t"+hashMap.entrySet());
		if(hashMap.containsKey(c))
		{
			System.out.println("Occurance for character:\t"+c+":\t"+hashMap.get(c));
		}
		
		
	}
	
	public boolean checkAngram(String first, String second)
	{
		char[] firstList = first.toCharArray();
		char[] secondList = second.toCharArray();
		
		if(firstList.length != secondList.length)
		{
			return false;
		}
		
		Arrays.sort(firstList);
		Arrays.sort(secondList);
		boolean flag = false;
		for(int i=0;i<firstList.length;i++)
		{
			if(firstList[i] == secondList[i])
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
		if(flag == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	    		
	}
	
	public void convertStringToInt(String ip)
	{
		
		try{
		
		System.out.println("String to integer:\t"+ Integer.parseInt(ip));
		}
		catch(NumberFormatException e)
		{
			System.out.println("Given string is not correct format to convert: \n");
			e.printStackTrace();
		}
	}
	
	public String reverseRec(String inp)
	{
		String reverse = "";
		if(inp.length() == 1)
		{
			return inp;
		}
		else
		{
			reverse += inp.substring(inp.length()-1)+reverseRec(inp.substring(0, inp.length()-1));
			return reverse;
		}
	}

public String reverseVowels(String s) {
        
        char[] charArray = s.toCharArray();
        String answer = "";
        List<Integer> positions = new ArrayList<Integer>();
        List<Integer> reversePostion = new ArrayList<Integer>();
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i] == 'a'||charArray[i] == 'e' ||charArray[i] == 'i' || charArray[i] == 'o'||charArray[i] == 'u')
            {
              positions.add(i);   
            }
        }
        for(int i=0;i<positions.size();i++)
        {
            System.out.println(""+positions.get(i));
        }
        reversePostion = positions;
        Collections.reverse(positions);
        int count =0,j=0;
        while(count<charArray.length)
        {
            if(count==reversePostion.get(j))
            {
                answer+=charArray[positions.get(j)];
                count++;j++;
            }
            else
            {
                answer+=charArray[count];
                count++;
            }
        }
       
        return answer;
    }
}
