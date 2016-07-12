package com.example.balanced.bst;

public class IsBalanceTree {
	
	public Node root;
	
	public boolean isBalanced(Node node)
	{
		int leftH=0,rightH =0;
		if(node == null){
			return true;}
		if(node != null && (node.left == null && node.right == null)){
			return true;}
		
			leftH = height(node.left);
			rightH = height(node.right);
			
			if(Math.abs(leftH-rightH) == 0 && isBalanced(node.left) && isBalanced(node.right)){
				return true;}
			
				return false;
				
	}
	
	public int height(Node node)
	{
		if(node == null)
			return 0;
		else
			return 1+Math.max(height(node.left),height(node.right));
	}
	
	public static void main(String[] args)
	{
		IsBalanceTree tree = new IsBalanceTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        //tree.root.left.left = new Node(4);
        //tree.root.left.right = new Node(5);
        //tree.root.left.left.left = new Node(8);
        
        if(tree.isBalanced(tree.root))
        {
        	System.out.println("Tree is balanced");
        }
        else
        	System.out.println("Tree is not balanced");
	}
	

}
