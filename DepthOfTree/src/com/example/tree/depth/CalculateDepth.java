package com.example.tree.depth;

public class CalculateDepth {

	public Node root;
	public int calculateDepth(Node node)
	{
		if(node == null)
			return 0;
		else
		{
			int lDepth = calculateDepth(node.left);
			int rDepth = calculateDepth(node.right);
			
			if(lDepth > rDepth)
				return lDepth+1;
			else
				return rDepth+1;
		}
		
	}
	
	public static void main(String[] args)
	{
		CalculateDepth tree = new CalculateDepth();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Depth of tree:\t"+tree.calculateDepth(tree.root));
		
	}
}
