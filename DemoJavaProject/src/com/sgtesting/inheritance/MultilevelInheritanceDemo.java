package com.sgtesting.inheritance;
class Family
{
	void GrandFather(String gfname)
	{
		System.out.println("Grand Father name:"+gfname);
	}
	
}
class Family2 extends Family
{
	void Father(String fname)
	{
		System.out.println("Father name:"+fname);
	}
}
class Family3 extends Family2
{
	void Daugther(String Dname)
	{
		System.out.println("Daughter name:"+Dname);
	}
	
}
public class MultilevelInheritanceDemo 
{

	public static void main(String[] args) 
	{
		Family3 obj=new Family3();
		obj.GrandFather("Rangappa");
		obj.Father("Narasimayya");
		obj.Daugther("Priyanka");
		

	}

}
