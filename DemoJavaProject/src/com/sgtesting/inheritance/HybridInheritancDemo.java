package com.sgtesting.inheritance;
class Student001
{
	Student001(String fname,int rollno)
	{
		System.out.println("First name:"+fname);
		System.out.println("Roll Number:"+rollno);
	}
	Student001(String branchname)
	{
		System.out.println("Branch name:"+branchname);
		
	}
}
class Student002 extends Student
{
	Student002(String fname,int rollno)
	{
		super(fname,rollno);
	}
	Student002(String branchname)
	{
		super(branchname);
		
	}
}
class Student003 extends Student1
{
	Student003(String fname,int rollno)
	{
		super(fname,rollno);
	}
	Student003(String branchname)
	{
		super(branchname);
		
	}
}
class Student004 extends Student
{
	Student004(String fname,int rollno)
	{
		super(fname,rollno);
	}
	Student004(String branchname)
	{
		super(branchname);
		
	}
}
public class HybridInheritancDemo {

	public static void main(String[] args) {
		Student2 pp=new Student2("Priyanka",002);
		Student2 pp1=new Student2("CSE");
		Student3 ll=new Student3("Devika",003);
		Student3 ll1=new Student3("EEE");

	}

}
