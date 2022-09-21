package com.sgtesting.inheritance;
class Family111
{
	Family111(String gfname1 , String foodtype)
	{
		System.out.println("Grand Father Name:"+gfname1);
		System.out.println(("Grand Father Food type :"+foodtype));
	}
	Family111(int age)
	{
		System.out.println("Grand Father age:"+age);
	}
	
}
class Family121 extends Family111
{
	Family121(String fname ,String foodtype)
	{
		super(fname,foodtype);
	}
	Family121(int age)
	{
		super(age);
	}
	 
}
class Family131 extends Family121
{
	Family131(String dname ,String foodtype)
	{
		super(dname,foodtype);
	}
	Family131(int age)
	{
		super(age);
	}
}
class Family15 extends Family111
{
	Family15(String gsname ,String foodtype)
	{
		super(gsname,foodtype);
	}
	Family15(int age)
	{
		super(age);
	}
}
public class HybridInheritance001Demo 
{

	public static void main(String[] args) 
	{
		Family131 o1=new Family131("Rangappa","nonveg");
		Family131 o2=new Family131(75);
		
		
		Family15 oo1=new Family15("narasimah","VEg");
		Family15 oo2=new Family15(75);
		
		
		
		
		
		


	}

}
