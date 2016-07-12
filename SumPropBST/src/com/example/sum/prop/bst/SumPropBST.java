package com.example.sum.prop.bst;

public class SumPropBST {

	public Node root;
	
	public int isSumProperty(Node node)
	{
		int leftValue = 0,rightValue = 0;
		if(node == null || node.left == null && node.right == null)
			return 1;
		else
		{
			if(node.left!=null)
				leftValue = node.left.data;
			if(node.right != null)
				rightValue = node.right.data;
			if((node.data == leftValue+rightValue) && isSumProperty(node.left)==1 &&isSumProperty(node.right)==1)
				return 1;
			else
				return 0;				
		}		
	}
	
	public static void main(String[] args)
	{
		SumPropBST tree = new SumPropBST();
		tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(9);
        
        int result = tree.isSumProperty(tree.root);
        if(result == 1)
        	System.out.println("Tree had Sum property");
        else
        	System.out.println("Tree doesnt have tree property");
        
        
	}
	
}
