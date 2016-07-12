package com.example.possible.paths;

public class FindAllPaths {
	
	Node root;
	
	public void printAllPaths(Node node, int path[], int length)
	{
		if(node == null)
			return;
		
		path[length] = node.data;
		length++;
		
		if(node.left == null && node.right == null)
			printPath(path,length);
		else
		{
			printAllPaths(node.left,path,length);
			printAllPaths(node.right, path, length);
		}
	}
	
	public void printPath(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }

	public static void main(String[] args)
	{
		FindAllPaths tree = new FindAllPaths();
		int path[] = new int[1000];		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.printAllPaths(tree.root,path,0);
	}
}
