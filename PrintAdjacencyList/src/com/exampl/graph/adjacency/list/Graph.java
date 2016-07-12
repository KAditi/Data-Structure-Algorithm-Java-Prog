package com.exampl.graph.adjacency.list;

import java.awt.event.AdjustmentListener;
import java.util.Scanner;

class AdjacentNode{
	public int numOdVertex;
	public AdjacentNode next;
	public AdjacentNode(int vCount, AdjacentNode next)
	{
		this.numOdVertex = vCount;
		this.next = next;
	}		
}
class Vertex{
	int vert;
	AdjacentNode node;
	public Vertex(int vert, AdjacentNode node)
	{
		this.vert = vert;
		this.node = node;
	}
}
public class Graph {
	
	Vertex[] adjList;
		
	public Graph()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int v = in.nextInt();
		adjList = new Vertex[v];
		for(int i=0;i<adjList.length;i++)
		{
			adjList[i] = new Vertex(i+1, null);
		}
		
		System.out.println("Enter Number of Edges");
		int e = in.nextInt();
		System.out.println("Enter edge like: <src> <dest>");
		for(int j=0;j<e;j++)
		{
			int n = checkForVertex(in.nextInt());
			int m = checkForVertex(in.nextInt());
			
			adjList[n].node = new AdjacentNode(m,adjList[n].node);
			
		}
	}
	public int checkForVertex(int src)
	{
		for(int j=0;j<adjList.length;j++)
		{
			if(adjList[j].vert == src)
				return j;
		}
		return -1;
	}
	public void print()
	{
		System.out.println("");
		for(int i=0;i<adjList.length;i++)
		{
			System.out.print(adjList[i].vert+"->");
			for(AdjacentNode currNode=adjList[i].node;currNode != null; currNode = currNode.next)
			{
				System.out.print(adjList[currNode.numOdVertex].vert+",");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args)
	{
		Graph graphCreated = new Graph();
		graphCreated.print();
	}		
}


