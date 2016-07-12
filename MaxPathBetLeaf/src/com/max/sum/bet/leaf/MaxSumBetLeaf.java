package com.max.sum.bet.leaf;

public class MaxSumBetLeaf {
	
	public Node root;
	
	public int maxSumBetLeaf(Node node, Res res)
	{
		if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return node.data;
        int ls = maxSumBetLeaf(node.left, res);
        int rs = maxSumBetLeaf(node.right, res);
        if (node.left != null && node.right != null) {
        	res.val = Math.max(res.val, ls + rs + node.data);
        	 
            // Return maxium possible value for root being
            // on one side
            return Math.max(ls, rs) + node.data;
        }
        
        return (node.left == null) ? rs + node.data
                : ls + node.data;
		
	}
	
	public int maxPathSum(Node node)
    {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        maxSumBetLeaf(root, res);
        return res.val;
    }
	
	public static void main(String[] args)
	{
		MaxSumBetLeaf tree = new MaxSumBetLeaf();
		tree.root = new Node(-15);
        tree.root.left = new Node(5);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(-8);
        tree.root.left.right = new Node(1);
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(6);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(9);
        tree.root.right.right.right = new Node(0);
        tree.root.right.right.right.left = new Node(4);
        tree.root.right.right.right.right = new Node(-1);
        tree.root.right.right.right.right.left = new Node(10);
        System.out.println("Max pathSum of the given binary tree is "
                + tree.maxPathSum(tree.root));
	}
}
