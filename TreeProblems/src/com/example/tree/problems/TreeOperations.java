package com.example.tree.problems;

public class TreeOperations {

	public static TreeNode root;
	public static void main(String[] args) {
		
		TreeOperations object = new TreeOperations();
		object.insertNode(3);
		object.insertNode(8);
		object.insertNode(1);
		object.insertNode(4);
		object.insertNode(6);
		object.insertNode(2);
		object.insertNode(10);
		object.insertNode(9);
		object.insertNode(20);
		object.insertNode(25);
		object.insertNode(15);
		object.insertNode(16);
		
		object.displayNodes(object.root);
		
		
	}
	
	public void insertNode(int data)
	{
		TreeNode node = new TreeNode(data);
		TreeNode parent = null;
		if(root == null)
		{
			root = node;
			return;
		}
		TreeNode currNode = root;
		while(true)
		{
			parent = currNode;
			if(data < currNode.getData() )
			{
				currNode = currNode.getLeft();
				if(currNode == null)
				{
					parent.setLeft(node);
					return;
				}
			}
			else
			{
				currNode = currNode.getRight();
				if(currNode == null)
				{
					parent.setRight(node);
					return;
				}
			}
		}			
	}
	
	public void displayNodes(TreeNode root)
	{
		if(root != null)
		{
			displayNodes(root.getLeft());
			System.out.print("\t"+root.getData());
			displayNodes(root.getRight());
		}
	}
	
	
}
