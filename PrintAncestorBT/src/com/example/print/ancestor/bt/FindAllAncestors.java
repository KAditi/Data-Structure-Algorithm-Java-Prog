package com.example.print.ancestor.bt;

public class FindAllAncestors {

	public Node root;
	
	public boolean findAllAncestors(Node node, int value)
	{
		if(node == null)
			return false;
		if(node.data == value)
			return true;
		if(findAllAncestors(node.left, value) || findAllAncestors(node.right, value))
		{
			System.out.print("\t"+node.data);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		FindAllAncestors tree = new FindAllAncestors();
		 tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.left.left.left = new Node(7);
	     
	     tree.findAllAncestors(tree.root, 7);
	}
}
