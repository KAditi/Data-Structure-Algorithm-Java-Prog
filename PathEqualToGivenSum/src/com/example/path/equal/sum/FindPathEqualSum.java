package com.example.path.equal.sum;

public class FindPathEqualSum {

	public Node root;
	
	public boolean findPath(Node node, int sum)
	{
		if(node == null)
			return (sum == 0);
		else
		{
			boolean flag = false;
			int subSum = sum - node.data;
			if(subSum == 0 && node.left == null && node.right == null)
				return true;
			if(node.left != null)
			{
				flag = flag || findPath(node.left, subSum);
			}
			if(node.right != null)
			{
				flag = flag || findPath(node.right, subSum);
			}
			return flag;
		}
		
	}
	
	public static void main(String[] args)
	{
		FindPathEqualSum tree = new FindPathEqualSum();
		int sum = 14;
		tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(9);
        
        if(tree.findPath(tree.root, sum))
        {
        	System.out.println("Tree has path equal to sum");
        }
        else
        {
        	System.out.println("No path available");
        }
	}
}
