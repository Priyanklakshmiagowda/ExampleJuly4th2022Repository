package com.sgtesting.Interface;
interface state
{
	void showstatename(String name);
}
interface districts extends state
{
	void showdistrictsname(String name);
	
}
interface taluk extends districts
{
	void showtalukname(String name);
	
}
class india implements  taluk
{
	public void showstatename(String name)
	{
		System.out.println("State name:"+name);
	}
	public void showdistrictsname(String name)
	{
		System.out.println("District name:"+name);
	}
	public void showtalukname(String name)
	{
		System.out.println("Taluk name:"+name);
	}
	void showcity(String name)
	{
		System.out.println("City name:"+name);
	}
	
}

public class MultilevelInterface 
{

	public static void main(String[] args) 
	{
		india o1=new india();
		o1.showstatename("karnataka");
		o1.showdistrictsname("Tumkur");
		o1.showtalukname("CN halli");
		o1.showcity("Bangalor");

	}

}
