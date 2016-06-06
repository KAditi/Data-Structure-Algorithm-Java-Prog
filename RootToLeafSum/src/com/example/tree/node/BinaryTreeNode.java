package com.example.tree.node;

public class BinaryTreeNode {
	
	private int data;
	private BinaryTreeNode right;
	private BinaryTreeNode left;
	BinaryTreeNode root;
	public BinaryTreeNode(int data)
	{
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	
	public void createTree(int data)
	{
		if(data < this.getData())
		{
			if(this.getLeft()!= null)
			{
				this.getLeft().createTree(data);
			}
			else
			{
				this.setLeft(new BinaryTreeNode(data));
			}
		}
		else
		{
			if(this.getRight()!= null)
			{
				this.getRight().createTree(data);
			}
			else
			{
				this.setRight(new BinaryTreeNode(data));
			}
			
		}
				
	}
	
	public void traverseInOrder()
	{
		if(this.getLeft()!= null)
		{
			this.getLeft().traverseInOrder();
		}
			
		System.out.print("\t"+this.getData());
		
		if(this.getRight()!= null)
		{
			this.getRight().traverseInOrder();
		}
		
			
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode obj = new BinaryTreeNode(20);
		int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		for(int i=0;i<nums.length;i++) {
			obj.createTree(nums[i]);		
		}
		obj.traverseInOrder();
	}
	
}
