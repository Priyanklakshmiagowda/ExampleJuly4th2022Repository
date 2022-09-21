package com.sgtesting.Interface;
interface state2
{
	void showstatename(String name);
}
interface districts2 extends state2
{
	void showdistrictsname(String name);
	
}
interface taluk2 extends state2 
{
	void showtalukname(String name);
	
}
class india2 implements  districts2,taluk2
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
public class HiraricalInterfaceDemo 
{

	public static void main(String[] args)
	{
		india2 o2=new india2();
		o2.showstatename("karnataka");
		o2.showdistrictsname("Tumkur");
		o2.showtalukname("CN halli");
		o2.showcity("Bangalore");

	}

}
