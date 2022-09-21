package com.sgtesting.constructor;
class SoftwareEngineer
{
	SoftwareEngineer(String empname,String compname)
	{
		System.out.println("Employee name:"+empname);
		System.out.println("Companay Name:"+compname);
	}
	SoftwareEngineer(String designation,int sal)
	{
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+sal);
	}
}
public class ConstructoroverloadingSoftwareengg 
{

	public static void main(String[] args) 
	{
		SoftwareEngineer test1=new SoftwareEngineer("Priyanka","Digit Insurance");
		SoftwareEngineer test2=new SoftwareEngineer("AutomationEngineer",50000);
		

	}

}
