package com.assignment4.optional;


public class LinkedList{ 
	static class Employee {
	
		private int empid;
		private String ename;
		private double sal;
		Employee next,prev;
		
		
		public Employee(int empid, String ename,double sal) {
			super();
			this.empid = empid;
			this.ename = ename;
			this.sal=sal;
		}
		@Override
		public String toString() {
			return "\nEmployee [empid=" + empid + ", Ename=" + ename + ", sal=" + sal + "]";
		}
		
	
	}
	
	Employee head,tail;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	head=tail=null;
	}
	
	
	public void addEmployee(int id,String name,double sal)
	{
		Employee e1=new Employee(id, name, sal);
		
		if(head==null && tail==null)
			head=tail=e1;
		else {
			e1.prev=tail;
			tail.next=e1;
			tail=tail.next;
			
		}
	}
	
	public void display()
	{
		Employee trav=head;
		
		if(head==null)
			return ;
		while(trav!=null)
		{
			System.out.println(trav);
			trav=trav.next;
		}
	}
	
	public boolean LinearSearchEmployee(String key) {
		
		Employee trav=head;
		
		if(head==null)
			return false;
		else
		{
			while(trav!=null)
			{
				if((trav.ename).equals(key))
				{
					return true;
				}
				trav=trav.next;
			}
		}
		return false;
		
	}

public boolean deleteEmployee(int key) {
		
		Employee trav=head;
		
		if(head==null)
			return false;
		else
		{
			while(trav!=null)
			{
				if(trav.empid==key)
				{
					trav.next.prev=trav.prev;
					trav.prev.next=trav.next;
					return true;
				}
				trav=trav.next;
			}
		}
		return false;
		
	}

public boolean updateEmployee(int key,double val) {
	
	Employee trav=head;
	
	if(head==null)
		return false;
	else
	{
		while(trav!=null)
		{
			if(trav.empid==key)
			{
				trav.sal=val;
				return true;
			}
			trav=trav.next;
		}
	}
	return false;
	
}
	
	
	
	
	
}

