package com.example.is.subtree;

public class IsSubTree {
	
	public Node root1,root2;
	public boolean isSubTree(Node node1, Node node2)
	{
		if(node2 == null)
			return true;
		if(node1 == null)
			return false;
		
		if(areSame(node1,node2))
		{
			return true;
		}
		return (isSubTree(node1.left, node2)|| isSubTree(node1.right, node2));
	}
	public boolean areSame(Node node1, Node node2)
	{
		if(node1 == null && node2 == null)
		{
			return true;
		}
		if(node1 == null || node2 == null)
		{
			return false;
		}
		return ((node1.data == node2.data) && areSame(node1.left, node2.left) && areSame(node1.right, node2.right));
	}
	
	public static void main(String[] args)
	{
		IsSubTree tree = new IsSubTree();
		tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4);
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);
        
        tree.root2 = new Node(10);
        tree.root2.right = new Node(6);
        tree.root2.left = new Node(4);
        tree.root2.left.right = new Node(30);
        
        if(tree.isSubTree(tree.root1, tree.root2))
        {
        	System.out.println("root2 is subtree of root1");
        }
        else
        {
        	System.out.println("No subtree");
        }
		
	}

}
