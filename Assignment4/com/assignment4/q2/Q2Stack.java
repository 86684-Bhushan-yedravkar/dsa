package com.assignment4.q2;

public class Q2Stack {

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

public Q2Stack()
{
head=tail=null;
size=0;
}

 

public void pushStack(int val)
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










public int popStack()
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
		temp=tail.data;
		tail.prev.next=null;
		tail=tail.prev;
		
	}
	size--;
	return temp;
	
}

public void displayStack()
{
	Node trav=tail;
	
	while(trav!=null)
	{
		System.out.println(trav.data);
		trav=trav.prev;
	}
}



public int peekStack()
{

	return tail.data;
}
}