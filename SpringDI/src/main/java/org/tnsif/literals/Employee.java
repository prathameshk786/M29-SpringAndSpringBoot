package org.tnsif.literals;
//To demonstrate on DI in the form of literals
public class Employee {
	//private data members
	//1.DI in the form of literals
	private int empid;
	private String empname;
	private String address;
	private float salary;
	
	//getters and setters 
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("Emp ID : "+empid+" "+"Emp Name:"+empname+" "+"Emp Address:"+"address"+" "+"Emp Salary :"+"salary"+"");
	}

}
