package com.reverse.level.order.bt;

public class PrintLevelReverseOrder {
	
	public Node root;
	public void printLevelRevOrder(Node node)
	{
		int h= height(node);
		int i;
		for(i = h;i >=1;i--)
		{
			printDataAtGivenLevel(node,i);
		}
	}
	
	public void printDataAtGivenLevel(Node node, int level)
	{
		if(node == null)
			return;
		if(level == 1)
		{
			System.out.print("\t"+node.data);
		}
		else if(level > 1)
		{
			printDataAtGivenLevel(node.left,level-1);
			printDataAtGivenLevel(node.right, level-1);
		}
	}
	
	int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            /* compute the height of each subtree */
            int lheight = height(node.left);
            int rheight = height(node.right);
 
            /* use the larger one */
            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }
	
	public static void main(String[] args)
	{
		PrintLevelReverseOrder tree = new PrintLevelReverseOrder();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.printLevelRevOrder(tree.root);
	}

}
