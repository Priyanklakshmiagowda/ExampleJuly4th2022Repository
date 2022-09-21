package com.sgtesting.inheritance;
class Family11
{
	void GrandFather1(String gfname1)
	{
		System.out.println("Grand Father Name:"+gfname1);
	}
}
class Family12 extends Family11
{
	void Mother1(String mname)
	{ 
		System.out.println("Mother name:"+mname);
	}
}
class Family13 extends Family12
{
	void Daugther1(String Dname)
	{
		System.out.println("Daughter name:"+Dname);
	}
	
}
class Family14 extends Family11
{
	void Aunt(String Aname)
	{
		System.out.println("Aunt name:"+ Aname);
	}
}

public class HybridInheritanceDemo
{

	public static void main(String[] args) 
	{
		Family13 obj1=new Family13();
		obj1.GrandFather1("Thimmayya");
		obj1.Mother1("Jayanthi");
		obj1.Daugther1("Devika");
		
		Family14 obj2=new Family14();
		obj2.Aunt("Sudha");
		
	}

}
