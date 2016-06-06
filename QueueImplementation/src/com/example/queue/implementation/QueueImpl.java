package com.example.queue.implementation;

public class QueueImpl {

	private int capacity;
	int queArray[];
	int front=0,rear = -1,currSize = 0;
	
	public QueueImpl(int size)
	{
		this.capacity = size;
		queArray = new int[capacity];
	}
	
	public void enqueue(int value)
	{
		if(isQueueFull()){
			System.out.println("Queue is full");
		}
		else
		{
			rear++;
			if(rear == capacity-1){
				rear = 0;
			}
			queArray[rear]= value;
			currSize++;
			
		}
			
	}
	
	public int dequeue()
	{
		int value=0;
		if(isQueueEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			value = queArray[front];
			front++;
			if(front == capacity -1)
				front = 0;
			currSize--;			
		}
		return value;
	}
	
	public boolean isQueueEmpty()
	{
		if(currSize == 0)
			return true;
		return false;
	}
	
	public boolean isQueueFull()
	{
		if(currSize == capacity)
			return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		QueueImpl obj = new QueueImpl(5);
		obj.enqueue(1);
		obj.enqueue(4);
		obj.enqueue(7);
		System.out.println("Deq:\t"+obj.dequeue());
		System.out.println("Deq:\t"+obj.dequeue());
		System.out.println("Deq:\t"+obj.dequeue());
		System.out.println("Deq:\t"+obj.dequeue());
		
	}
	
}
