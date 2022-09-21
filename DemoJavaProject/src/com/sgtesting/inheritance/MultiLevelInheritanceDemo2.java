package com.sgtesting.inheritance;
class Student
{
	Student(String fname,int rollno)
	{
		System.out.println("First name:"+fname);
		System.out.println("Roll Number:"+rollno);
	}
	Student(String branchname)
	{
		System.out.println("Branch name:"+branchname);
		
	}
}
class Student1 extends Student
{
	Student1(String fname,int rollno)
	{
		super(fname,rollno);
	}
	Student1(String branchname)
	{
		super(branchname);
		
	}
}
class Student2 extends Student1
{
	Student2(String fname,int rollno)
	{
		super(fname,rollno);
	}
	Student2(String branchname)
	{
		super(branchname);
		
	}
}
class Student3 extends Student2
{
	Student3(String fname,int rollno)
	{
		super(fname,rollno);
	}
	Student3(String branchname)
	{
		super(branchname);
		
	}
}
public class MultiLevelInheritanceDemo2 
{

	public static void main(String[] args) 
	{
		Student3 o6=new Student3("Priyanka",003);
		Student3 o7=new Student3("CSE");
		

	}

}
