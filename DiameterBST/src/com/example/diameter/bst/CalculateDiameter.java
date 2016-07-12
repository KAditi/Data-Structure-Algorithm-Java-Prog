package com.example.diameter.bst;

import java.awt.HeadlessException;

public class CalculateDiameter {
	
	Node root;
	public int calDiameter(Node node)
	{
		int leftD=0,rightD=0,leftH =0,rightH=0;
		if(node == null)
			return 0;
		else if(node != null && node.left == null && node.right == null)
			return 1;
		else
		{
			leftD = calDiameter(node.left);
			rightD = calDiameter(node.right);
			
			leftH = height(node.left);
			rightH = height(node.right);
			
			return Math.max((leftH+rightH+1),Math.max(leftD, rightD));			
		}		
	}
	public int height(Node node)
	{
		if(node == null)
			return 0;
		else if(node != null && node.left == null && node.right == null)
			return 1;
		else
		{
			return (1+Math.max(height(node.left),height(node.right)));
		}
	}
	
	public static void main(String[] args)
	{
		CalculateDiameter tree = new CalculateDiameter();
		 tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     
	     System.out.println("Diameter of tree:\t"+tree.calDiameter(tree.root));
	}

}
