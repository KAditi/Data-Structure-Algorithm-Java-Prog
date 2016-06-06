package com.example.swap.node;

public class LinkedListNode {
	
	public LinkedListNode next;
	public int data;
	public LinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
