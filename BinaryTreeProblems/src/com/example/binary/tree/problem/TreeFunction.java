package com.example.binary.tree.problem;

public class TreeFunction {
	
	private Node root;
	//Function to find node 
	public Node findNode(int key)
	{
		Node currNode = root;
		
		while(currNode.getData() != key)
		{
			if(key <currNode.getData())
			{
				currNode  = currNode.getLeftChild();
			}
			else if(key > currNode.getData())
			{
				currNode = currNode.getRightChild();
			}			
		}
		return currNode;
	}
	
	public void insertNode(int data)
	{
		Node newNode = new Node(data);
		
		Node currNode ;
		
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			currNode = root;
			Node parent;
			while(true)
			{
				parent = currNode;
				
				if(data < currNode.getData())
				{
					currNode = currNode.getLeftChild();
					if(currNode == null)
					{
						parent.setLeftChild(newNode);
						return;
					}
				}
				else
				{
					currNode = currNode.getRightChild();
					if(currNode == null)
					{
						parent.setRightChild(newNode);
						return;
					}
				}
			}		
		}		
	}
	
	public void inOrderTraversal(Node localRoot)
	{
		if(localRoot != null)
		{
			inOrderTraversal(localRoot.getLeftChild());
			System.out.println(" "+localRoot.getData());
			inOrderTraversal(localRoot.getRightChild());
		}
	}
	
	public void preOrderTraversal(Node localRoot)
	{
		if(localRoot !=null)
		{
			System.out.println(" "+localRoot.getData());
			preOrderTraversal(localRoot.getLeftChild());
			preOrderTraversal(localRoot.getRightChild());
		}
	}
	
	public void postOrderTraversal(Node localRoot)
	{
		if(localRoot != null)
		{
			postOrderTraversal(localRoot.getLeftChild());
			postOrderTraversal(localRoot.getRightChild());
			System.out.println(" "+localRoot.getData());
		}
	}
	
	public Node findMinimum()
	{
		Node currNode, lastNode=null;
		currNode = root;
		while(currNode != null)
		{
			lastNode = currNode;
			currNode = currNode.getLeftChild();
		}
		return lastNode;
	}
	
	public Node findMin(Node node)
	{
		 if(node.getLeftChild() == null) {
		        return node;
		    } else {
		        return findMin(node.getLeftChild());
		    }
	}
	public Node findMax(Node node)
	{
		if(node.getRightChild() == null) {
	        return node;
	    } else {
	        return findMin(node.getRightChild());
	    }
	}
	
	public Node findMaximum()
	{
		Node currNode,lastNode = null;
		currNode = root;
		while(currNode != null)
		{
			lastNode = currNode;
			currNode = currNode.getRightChild();
		}
		
		return lastNode;
	}
	
	public void deleteNode(int key)
	{
		this.root = deleteNode(this.root, key);
	}
	public Node deleteNode(Node node, int key)
	{
		Node temp;
		
		if(node == null)
			System.out.println("Element is not found");
		else if(key < node.getData())
			node.setLeftChild(deleteNode(node.getLeftChild(),key));
		else if(key > node.getData())
			node.setRightChild(deleteNode(node.getRightChild(),key));
		else
		{
			if(node.getLeftChild()!= null && node.getRightChild()!= null)
			{
				temp = findMax(node.getLeftChild());
				node.setData(temp.getData());
				node.setLeftChild(deleteNode(node.getLeftChild(),node.getData()));
			}
			else
			{
				temp = node;
				if(node.getLeftChild() == null)
					node = node.getRightChild();
				if(node.getRightChild() == null)
					node = node.getLeftChild();
				temp = null;
			}
		}
		return node;
	}
	
	private Node deleteMin(Node node) {
	    if(node.getLeftChild() == null) {
	        return node.getRightChild();
	    }
	    node.setLeftChild(deleteMin(node.getLeftChild()));
	    return node;
	}
	
	public Node findLCA(Node root, Node firstNode, Node secondNode)
	{
		if(root == null)
			return null;
		if(root == firstNode || root == secondNode)
			return root;
		if(Math.max(firstNode.getData(),secondNode.getData())< root.getData())
		{
			return findLCA(root.getLeftChild(),firstNode,secondNode);
		}
		else if(Math.min(firstNode.getData(),secondNode.getData())> root.getData())
		{
			return findLCA(root.getRightChild(),firstNode,secondNode);
		}
		
		return root;
		
	}
	
	public boolean isBST(Node root)
	{
		if(root == null)
			return true;
		if(root.getLeftChild()!= null && root.getLeftChild().getData() > root.getData())
		{
			return false;
		}
		if(root.getRightChild()!=null && root.getRightChild().getData() < root.getData())
			return false;
		if(!isBST(root.getLeftChild()) || !isBST(root.getRightChild()))
			return false;
		return true;
		
	}

}
