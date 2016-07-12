package com.exampl.graph.adjacency.list;

import java.util.*;

public class PrintAList {
	
	public static Map<Integer, List<Integer>> result;

	public PrintAList(int numOdVertices)
	{
		result = new HashMap<Integer, List<Integer>>();
		for(int i=0;i<numOdVertices;i++)
		{
			result.put(i, new LinkedList<Integer>());
		}
	}
	
	public void setEdge(int src, int dest)
	{
		if(src > result.size() || dest > result.size())
		{
			return;			
		}
		if(result.containsKey(src))
		{
			result.get(src).add(dest);
		}
		else
		{
			List<Integer> srcList = new ArrayList<Integer>();
			srcList.add(dest);
			result.put(src,srcList);
		}
		
		//List<Integer> destList = result.get(dest);
		//destList.add(src);
	}
	
	public List<Integer> getEdge(int src)
	{
		if(src > result.size())
		{
			return null;
		}
		
		return result.get(src);
		
	}
	
	public static void main(String[] args)
	{
		int src,dest,numOfVert,numofEdges;
		try
		{
			int i=0;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter no of Vertices");
			numOfVert = in.nextInt();
			System.out.println("Enter no of edges");
			numofEdges = in.nextInt();
			PrintAList graphNode = new PrintAList(numOfVert);
			
			System.out.println("Enter edge: src and dest");
			{
				while(i<numofEdges)
				{
					src = in.nextInt();
					dest = in.nextInt();
					graphNode.setEdge(src, dest);
					i++;
				}
			}
			
			System.out.println("Adjacency List");
			for(int j=0;j<numOfVert;j++)
			{
				System.out.print(j+"->");
				List<Integer> listOfEdge = graphNode.getEdge(j);
				//System.out.println("");
				for(int k=1;k<listOfEdge.size();k++)
				{	
					
					System.out.print("\t"+listOfEdge.get(k));
					
				}
				System.out.println("");
			}
			in.close();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
