package com.example.tree.size;

public class BinaryTreeSize {
	
	public Node root;
	public int sizeOfTree(Node node)
	{
		if(node == null)
			return 0;
		else
			return sizeOfTree(node.left)+sizeOfTree(node.right)+1;
	}
	
	public int sizeOfTree()
	{
		return sizeOfTree(root);
	}
	 public static void main(String[] args)
	 {
		 BinaryTreeSize tree = new BinaryTreeSize();
		 tree.root = new Node(1);
		 tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     
	     System.out.println("Size of tree:\t"+tree.sizeOfTree());
	 }

}
