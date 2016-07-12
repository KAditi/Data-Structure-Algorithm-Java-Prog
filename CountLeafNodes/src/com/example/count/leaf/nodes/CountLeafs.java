package com.example.count.leaf.nodes;

public class CountLeafs {
	
	public Node root;
	
	public int calculateLeafs(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		if(node.left == null && node.right == null)
			return 1;
		else
		{
			return calculateLeafs(node.left)+calculateLeafs(node.right);
		}
	}
	
	public static void main(String[] args)
	{
		CountLeafs tree = new CountLeafs();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Number of Leaf:"+tree.calculateLeafs(tree.root));
         
        
	}

}
