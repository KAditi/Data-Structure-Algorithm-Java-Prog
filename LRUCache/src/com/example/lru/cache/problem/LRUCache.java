package com.example.lru.cache.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LRUCache {

	 private int capacity;
	    private HashMap<Integer,Integer> mapValue ;
	    private Queue<Integer>  keyQueue ;
	    private Queue<Integer> useQueue;
	    public LRUCache(int capacity) {
	        
	        this.capacity = capacity;
	        mapValue  = new HashMap<Integer, Integer>();
	        keyQueue = new LinkedList<Integer>();
	        useQueue = new LinkedList<Integer>();
	    }
	    
	    public int get(int key) {
	        useQueue.add(key);
	        if(mapValue != null){
	            
	        if(mapValue.containsKey(key))
	        {
	           return mapValue.get(key);
	        }
	            
	        }
	        return -1;
	    }
	    
	    public void set(int key, int value) {
	       
	       if(mapValue.size() < this.capacity)
	       {
	           mapValue.put(key,value);
	           keyQueue.add(key);
	           
	       }
	       else
	       {
	           int keyVal;
	          /* if(!useQueue.isEmpty())
	           {
	               keyVal = useQueue.poll();
	           }
	           else
	           {
	               keyVal = keyQueue.poll();
	           }*/
	           int temp = useQueue.peek();
	           List<Integer> list = new ArrayList<Integer>();
	           for(Integer obj: keyQueue)
	           {
	               if(temp == keyQueue.peek())
	               {
	                   list.add(keyQueue.poll());
	               }
	               else
	               {
	                    break;
	               }
	           }
	           for(int i=0;i<list.size();i++)
	           {
	               keyQueue.add(list.get(i));
	               
	           }
	           list.clear();
	           keyVal = keyQueue.poll();
	           mapValue.remove(keyVal);
	           mapValue.put(key,value);
	           keyQueue.add(key);
	       }
	    }
    
    public static void main(String[] args)
    {
    	LRUCache object = new LRUCache(2);
    	object.set(2,1);
    	object.set(1,1);
    	System.out.println(object.mapValue.toString());
    	System.out.println("Get(2)"+object.get(2));
    	object.set(4,1);
    	System.out.println("Get(1)"+object.get(1));
    	System.out.println("Get(2) After"+object.get(2));
    }
}
