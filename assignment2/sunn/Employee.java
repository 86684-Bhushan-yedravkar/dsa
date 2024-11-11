package com.sunn;



public class Employee {

	private int empid;
	private String Ename;
	private double sal;
	
	
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int empid, String ename,double sal) {
		super();
		this.empid = empid;
		Ename = ename;
		this.sal=sal;
	}
	public Employee() {
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "\nEmployee [empid=" + empid + ", Ename=" + Ename + ", sal=" + sal + "]";
	}
	



public void sortEmployee(Employee []arr) {
	
	int size=arr.length;
	double temp;
	
	
	
	for(int i=1;i<size;i++)
	{
		for(int j=0;j<size-1;j++)
		{
			if(arr[j+1].sal<arr[j].sal)
			{
				temp=arr[j].sal;
				arr[j].sal=arr[j+1].sal;
				arr[j+1].sal=temp;
				
				
			}
		}
	}
	
}

}

