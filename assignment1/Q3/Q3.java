package com.sun;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
 public static int findbyid(Employee emp[],int empid) {
	  for (int i = 0; i < emp.length; i++) {
		if(emp[i].getEmpid()==(empid))
			return i;
	}
	 return -1;
 }

 public static int findbyname(Employee emp[],String name) {
	  for (int i = 0; i < emp.length; i++) {
		if(emp[i].getName().equals(name))
			return i;
	}
	 return -1;
}

	public static  void main(String[] args) {
Scanner sc=new Scanner(System.in);

		Employee  emp []=new Employee[5];
		emp[0]=new Employee(1,"bhushan");
		emp[1]=new Employee(2,"mk");
		emp[2]=new Employee(3,"ak");
		emp[3]=new Employee(4,"sk");
		emp[4]=new Employee(5,"gk");
	
		System.out.println(Arrays.toString(emp));
		System.out.println("enter the empid");
        int empid = sc.nextInt()	;
        System.out.println("enter the id");
        
        int index=findbyid( emp, empid);
        
        if (index == -1)
			System.out.println("Employee not found...!");
		else
			System.out.println("Employee found at index: " + index+"id and name willbe="+emp[index].getEmpid()+emp[index].getName());

        System.out.println("enter the name");
        String name = sc.next()	;
        System.out.println("enter the id");
        
        index=findbyname( emp, name);
        
        if (index == -1)
			System.out.println("Employee not found...!");
		else
			System.out.println("Employee found at index: " + index+"id and name willbe="+emp[index].getEmpid()+emp[index].getName());


	}

}
