package com.sunn;
import java.util.Scanner;
import java.util.Arrays;

public class Q2 {



	
		

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Employee emp[]=new Employee[5];
			Employee e1=new Employee();
			
			emp[0]=new Employee(1,"vishal",2000);
			emp[1]=new Employee(2,"bhushan",1000);
			emp[2]=new Employee(3,"prathmesh",6000);
			emp[3]=new Employee(4,"ritesh",1500);
			emp[4]=new Employee(5,"mayur",3500);
			
			System.out.println("Before Salary wise Sorting ");
			System.out.println(Arrays.toString(emp));
			
			e1.sortEmployee(emp);
			
			System.out.println("After Salary wise Sorting ");
			System.out.println(Arrays.toString(emp));
			
		}
	}





