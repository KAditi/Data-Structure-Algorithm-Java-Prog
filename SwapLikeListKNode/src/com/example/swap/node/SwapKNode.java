package com.example.swap.node;

import java.util.ArrayList;
import java.util.LinkedList;

public class SwapKNode {

	static LinkedListNode head;
	
	public void createList(int data)
	{
		LinkedListNode node = new LinkedListNode(data);
		
		if(head == null)
		{
			head = node;			
		}
		else
		{
			LinkedListNode currNode = head;
			while(currNode.next != null)
			{
				currNode = currNode.next;
			}
			
			currNode.next = node;
		}
		
	}
	
	public void printList()
	{
		if(head == null)
		{
			return;
		}
		LinkedListNode currNode = head;
		while(currNode.next != null)
		{
			System.out.print("\t"+currNode.getData());
			currNode = currNode.next;
		}
		System.out.print("\t"+currNode.getData());
	}
	public void SwapKNode(int k)
	{
		int count =0,i=0;
		LinkedListNode slowPtr=head, fastPtr= head,nodeToSwap = head;
		while(i < k-1)
		{
			nodeToSwap = nodeToSwap.next;
			i++;
		}
		while(count<k)
		{
			slowPtr = slowPtr.next;
			//nodeToSwap = nodeToSwap.next;
			count++;
		}
		while(slowPtr.next != null)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		//Swap value
		int temp = fastPtr.getData();
		fastPtr.setData(nodeToSwap.getData());
		nodeToSwap.setData(temp);
		
	}
	
	public void findMiddle()
	{
		LinkedListNode slowPtr=head, fastPtr= head;
		while(fastPtr.getNext().getNext()!=null)
		{
			fastPtr= fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
		}
		System.out.println("");
		System.out.println("Middle element is:\t"+slowPtr.getData());
	}
	public void findKthElement(int k)
	{
		LinkedListNode slowPtr=head, fastPtr=head;
		int i=1;
		while(i<k)
		{
			fastPtr = fastPtr.getNext();
			i++;
		}
		while(fastPtr.getNext()!= null)
		{
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext();
		}
		System.out.println("Kth element is:\t"+slowPtr.getData());
		
	}
	public void findLoop()
	{
		LinkedListNode slowPtr = head, fastPtr = head;
		while(fastPtr.getNext().getNext()!= null)
		{
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(slowPtr == fastPtr)
			{
				System.out.println("Cycle found at:"+fastPtr.getData());
				break;
			}				
		}
		System.out.println("Given Linked list is acyclic");
	}
	public void appendIntoTail(LinkedListNode node) {
		
		
		LinkedListNode current = head;
       
        //find last element of LinkedList i.e. tail
        while(current.getNext() != null){
            current = current.getNext();
        }
        //appending new node to tail in LinkedList
        current.setNext(node);
    }
	
	public void reverseLinkeList()
	{
		ArrayList<Integer> listData = new ArrayList();
		LinkedListNode currNode = head;
		while(currNode.getNext()!=null)
		{
			listData.add(currNode.getData());
			currNode = currNode.getNext();
		}
		for(int i=listData.size()-1;i>=0;i--)
		{
			System.out.print("\t"+listData.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		SwapKNode obj1 = new SwapKNode();
		obj1.createList(1);
		obj1.createList(2);
		obj1.createList(3);
		obj1.createList(4);
		obj1.createList(5);
		obj1.createList(6);		
		obj1.createList(7);
		obj1.createList(10);
		
		
		obj1.printList();
		obj1.findMiddle();
		obj1.findKthElement(3);
		System.out.println("After reverse");
		obj1.reverseLinkeList();
		obj1.SwapKNode(3);
		obj1.findLoop();
		System.out.println("After swapping");
		obj1.printList();
		System.out.println("");
		
		SwapKNode objCyclic = new SwapKNode();
		LinkedListNode cyclicNode = new LinkedListNode(78);
		objCyclic.createList(9);
		objCyclic.createList(65);
		objCyclic.createList(24);
		objCyclic.createList(27);
		objCyclic.appendIntoTail(cyclicNode);
		objCyclic.createList(20);
		objCyclic.createList(13);
		objCyclic.createList(14);
		objCyclic.appendIntoTail(cyclicNode);
		objCyclic.findLoop();	
		
	}
}
