package com.example.binary.tree.operations;

public class BinaryTreeNode {
	
	public int data;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public int getData()
	{
		return this.data;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	
	public BinaryTreeNode getLeft()
	{
		return this.left;
	}
	public void setLeft(BinaryTreeNode left)
	{
		this.left = left;
	}
	public BinaryTreeNode getRight()
	{
		return this.left;
	}
	public void setRight(BinaryTreeNode right)
	{
		this.left = right;
	}
}
