package com.assignment4.optional;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		int ch=0;
		l1.addEmployee(1,"vishal", 100000);
		l1.addEmployee(2,"vikas", 150000);
		l1.addEmployee(3,"Datta", 200000);
		l1.addEmployee(4,"Bhushan", 100000);
		l1.addEmployee(5,"prathm", 250000);
		do {
					
			System.out.println("1.Add employee\n2.Display all employees\n3.Search employee by name\n4.Delete employee by empid\n5.Update salary of employee\nEnter Choice :");
			ch=sc.nextInt(); 
			switch (ch) {
			case 1:
				System.out.print("Enter Emp Id:");
				int id=sc.nextInt();
				System.out.print("Enter Emp Name:");
				String name=sc.next();
				System.out.print("Enter Emp Salary:");
				double salary=sc.nextDouble();
				
				l1.addEmployee(id, name, salary);
				
				
				break;
			case  2:
				l1.display();
				break;
			case  3:
				System.out.print("Enter Emp Name:");
				name=sc.next();
				
				if(l1.LinearSearchEmployee(name))
				{
					System.out.println("Employee Found !!!");
				}
				else
					System.out.println("Employee not Found !!!");
				
				break;
			case  4:
				l1.display();
				System.out.print("Enter Emp Id:");
				 id=sc.nextInt();
				
				if(l1.deleteEmployee(id))
				{
					System.out.println("Employee Deleted Successfully !!!");
				}
				else
					System.out.println("Employee not Found !!!");
				break;
			case 5:
				
				System.out.print("Enter Emp Id:");
				 id=sc.nextInt();
				 
				 System.out.println("Enter New Salary of Employee :");
				 double sal=sc.nextDouble();
				if(l1.updateEmployee(id, sal))
				{
					System.out.println("Employee Salary updated Successfully !!!");
				}
				else
					System.out.println("Employee not Found !!!");
				
				break;
			default:
				break;
			}
			
		} while (ch!=0);
		
		
		

		l1.display();
	}

}
