package com.example.bt.sum.tree;

public class IsSumTree {
	
	public Node root;
	
	public int isSumTree(Node node)
	{
		int leftSum = 0, rightSum = 0;
		if(node == null || (node.left == null && node.right == null))
			return 1;
		
		leftSum = sum(node.left);
		rightSum = sum(node.right);
		
		if((node.data == leftSum+rightSum )&& (isSumTree(node.left)) != 0 && (isSumTree(node.right))!=0)
		{
			return 1;
		}
		return 0;
		
		
	}
	
	public int sum(Node node)
	{
		if(node == null){
			return 0;}
		
			return sum(node.left)+node.data+sum(node.right);
	}
	
	public static void main(String[] args)
	{
		IsSumTree tree = new IsSumTree();
		tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(8);
        
        if(tree.isSumTree(tree.root) != 0)
        {
        	System.out.println("Tree is Sum tree");
        }
        else
        {
        	System.out.println("Tree is not sum tree");
        }
	}

}
