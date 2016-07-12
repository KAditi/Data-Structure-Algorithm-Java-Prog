package com.example.identical.tree;

public class IdenticalTree {
	
	public Node root1,root2;
	public boolean identicalTree(Node node1, Node node2)
	{
		if(node1 == null && node2 == null)
			return true;
		else if(node1 == null || node2 == null)
			return false;
		if(node1 != null && node2 != null)
		{
			return (node1.data == node2.data && identicalTree(node1.left, node2.left) && identicalTree(node1.right, node2.right));
		}
		else
			return false;
		
	}
	
	public static void main(String[] args)
	{
		IdenticalTree tree = new IdenticalTree();
		tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
 
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(7);
        
        if(tree.identicalTree(tree.root1, tree.root2))
        {
        	System.out.println("Trees are indentical");
        }
        else
        	System.out.println("Trees are not identical");
	}
	

}
