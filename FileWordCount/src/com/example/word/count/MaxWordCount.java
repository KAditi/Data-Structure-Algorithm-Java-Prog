package com.example.word.count;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MaxWordCount {

	public Map<String,Integer> countWords(String fileName)
	{
		Map<String,Integer> wordMap = new HashMap<String,Integer>();
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		try
		{
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while((line = br.readLine()) != null)
			{
				StringTokenizer str = new StringTokenizer(line," ");
				while(str.hasMoreTokens())
				{
					String tmp = str.nextToken().toLowerCase();
					if(wordMap.containsKey(tmp))
					{
						wordMap.put(tmp,wordMap.get(tmp)+1);
					}
					else
					{
						wordMap.put(tmp,1);
					}
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
            try{if(br != null) br.close();}catch(Exception ex){}
        }
		return wordMap;
		
		}
	
	public List<Entry<String,Integer>> sortByValue(Map<String,Integer> map)
	{
		Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        return list;
    }
	
	public static void main(String[] args) {
		MaxWordCount object = new MaxWordCount();
		Map<String,Integer> map = object.countWords("D:/mytest.txt");
		//List<Entry<String, Integer>> list = object.sortByValue(map);
		Set<Entry<String, Integer>> list = map.entrySet();
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" :: "+entry.getValue());
        }
    
	}
	
}
