package com.example.convert.sum.prop;

public class ConvertSupPropTree {
	
	public Node root;
	public void ConvertTree(Node node)
	{
		int leftVal=0,rightVal=0,diff=0;
		if(node == null || (node.left == null && node.right == null))
			return;
		else
		{
				ConvertTree(node.left);
				ConvertTree(node.right);
				
				if(node.left != null)
				{
					leftVal = node.left.data;
				}
				if(node.right != null)
				{
					rightVal = node.right.data;
				}
				diff = rightVal+leftVal-node.data;
				if(diff>0)
				{
					node.data = node.data+diff;
				}
				if(diff<0)
				{
					increment(node.right,-diff);
				}
		}
	}
	
	public void increment(Node node,int diff)
	{
		if(node.left != null)
		{
			node.left.data = node.left.data + diff;
			increment(node.left, diff);
		}
		else if(node.right != null)
		{
			node.right.data = node.right.data + diff;
			increment(node.right, diff);
		}
	}
	
	public void inOrderTraverse(Node node)
	{
		if(node == null)
			return;
		inOrderTraverse(node.left);
		System.out.print("\t"+node.data);
		inOrderTraverse(node.right);
	}
	
	public static void  main(String[] args)
	{
		ConvertSupPropTree tree = new ConvertSupPropTree();
		tree.root = new Node(50);
        tree.root.left = new Node(7);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(30);
        
        System.out.println("Tree before convert");
        tree.inOrderTraverse(tree.root);
        
        System.out.println("");
        tree.ConvertTree(tree.root);
        
        System.out.println("Tree after conversion");
        tree.inOrderTraverse(tree.root);
	
	}
}
