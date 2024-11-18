package com.assignment4.q1;

public class LinkedList {
	static class Node{
		private int data;
		Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
		
	
	}
	Node tail;
	int size;
	public LinkedList() {
		super();
		this.tail = null;
		
	}
	
	public void addFirst(int val)
	{
		Node nn=new Node(val);
		if(isEmpty())
		{
			tail=nn;
			tail.next=tail;
		}
		else
		{
			nn.next=tail.next;
			tail.next=nn;
		}
		size++;
	}
	
	public void displayList()
	{
		Node trav=tail.next;
//		for(int i=0;i<size;i++)
//		{
//			
//			System.out.print(trav.data+" ");
//			trav=trav.next;
//		}
		do
		{
			System.out.print(trav.data+" ");
			trav=trav.next;
		}while(trav!=tail.next);
	}
	
	public void addLast(int val)
	{
		Node nn=new Node(val);
		
		if(isEmpty())
		{
			tail=nn;
			nn.next=tail;
			
		}
		else 
		{
			nn.next=tail.next;
			tail.next=nn;
			tail=tail.next;
		}
		size++;
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			return ;
		else if(tail.next==tail)
		{
			tail=null;
		}
		else
		{
			tail.next=tail.next.next;
		}
			
		size--;
	}
	
	
	
	public void deleteLast()
	{
		if(isEmpty())
			return ;
		else if(tail.next==tail)
		{
			tail=null;
		}
		else
		{
			Node trav=tail.next;
			for(int i=0;i<size;i++)
				trav=trav.next;
			trav.next=tail.next;
			tail=trav;
			
		}
		size--;
					
	}
	void createAtPosition(int pos,int val)
	{
		if(pos<1 ||pos>size +1)
			return ;
		
		Node nn=new Node(val);
		
		if(isEmpty())
		{
			tail=nn;
			tail.next=tail;
		}
		else if(pos==1)
		{
			addFirst(val);
			return;
		}
		else if(pos==size+1)
			{
			addLast(val);
			return;
			}
		else
		{
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			
			nn.next=trav.next;
			trav.next=nn;
		}
	}
	
	
	void deleteAtPosition(int pos)
	{
		System.out.println("\nsize:"+size);
		if(pos<1 ||pos>size +1)
		{
			return ;
		}
		
		if(isEmpty())
		{
			return;
		}
		
		else if(tail.next==tail)
			{
			tail=null;
			}
		else if(pos==1)
		{
			deleteFirst();
			return;
		}
		else if(pos==size)
		{

			deleteLast();
			return;
		}
		else
		{
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			
			
			trav.next=trav.next.next;
		}
		size--;
	}
	
	public boolean isEmpty()
	{
	if(size==0)
		return true;
	return false;
	}

}
