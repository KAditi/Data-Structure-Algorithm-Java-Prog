package com.example.mirrot.tree;

public class MirrorOfTree {

	public Node root;
	
	public void mirror(Node node)
	{
		if(node == null)
			return;
		else
		{
			mirror(node.left);
			mirror(node.right);
			
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;;
		}
	}
	
	public void inOrder(Node node)
	{
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print("\t"+node.data);
		inOrder(node.right);

	}
	
	public static void main(String[] args)
	{
		MirrorOfTree tree = new MirrorOfTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Original tree");
        tree.inOrder(tree.root);
        
        System.out.println("Mirror Tree");
        tree.mirror(tree.root);
        tree.inOrder(tree.root);
	}
	
}
