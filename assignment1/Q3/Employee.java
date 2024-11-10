package com.sun;

import java.util.Objects;

public class Employee {
 private int empid;
 private String name;
 
 
public Employee(int empid, String name) {
	
	this.empid = empid;
	this.name = name;
}


public int getEmpid() {
	return empid;
}


public void setEmpid(int empid) {
	this.empid = empid;
}


public String getName() {
	return name;
}


@Override
public int hashCode() {
	return Objects.hash(empid, name);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empid == other.empid && Objects.equals(name, other.name);
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Empoyee [empid=" + empid + ", name=" + name + "]";
}
 
 
	

}
