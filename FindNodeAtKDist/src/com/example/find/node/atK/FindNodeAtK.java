package com.example.find.node.atK;

public class FindNodeAtK {

	public Node root;
	
	public void findNodeAtKDist(Node node, int k)
	{
		if(node == null)
			return;
		if(k == 0)
		{
			System.out.print("\t"+node.data);
			return;
		}
		else
		{
			findNodeAtKDist(node.left, k-1);
			findNodeAtKDist(node.right, k-1);
		}
	}
	
	public static void main(String[] args)
	{
		FindNodeAtK tree = new FindNodeAtK();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
        
        tree.findNodeAtKDist(tree.root,1);
        
	}
}
