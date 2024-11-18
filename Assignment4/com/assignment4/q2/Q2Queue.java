package com.assignment4.q2;

import com.assignment4.q2.Q2Stack.Node;

public class Q2Queue {

	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int value)
		{
			data=value;
			next=null;
			prev=null;
		}
		
	}
	int size;

	Node head,tail;

	public Q2Queue()
	{
	head=tail=null;
	size=0;
	}

	
	public void pushQueue(int val)
	{
		Node nn=new Node(val);
		if(head==null)
		{
			head=tail=nn;
		}
		else
		{
			nn.prev=tail;
			tail.next=nn;
			tail=nn;
		}
		size++;
	}
	
	public int popQueue()
	{
		int temp=0;
		if(head==null && tail==null)
			return -1;
		
		else if(head==tail)
		{	temp=tail.data;
		head=tail=null;
		
		}	
		else
		{
			head.next.prev=null;
			head=head.next;
			
		}
		size--;
		return temp;
		
	}
	
	
	public int peekQueue()
	{
		return head.data;
	}
	public void displayQueue()
	{
		Node trav=head;
		
		while(trav!=null)
		{
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
	}
}
