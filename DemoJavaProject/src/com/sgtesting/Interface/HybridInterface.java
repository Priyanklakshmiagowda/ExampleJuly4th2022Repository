package com.sgtesting.Interface;
interface state3
{
	void showstatename(String name);
}
interface districts3 extends state3
{
	void showdistrictsname(String name);
	
}
interface taluk3 extends  districts3
{
	void showtalukname(String name);
	
} 
interface village extends state3
{
	void showvillagename(String name);
}
class india3 implements village,taluk3
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
	public void showvillagename(String name)
	{
		System.out.println("Taluk name:"+name);
	}
	
	void showcity(String name)
	{
		System.out.println("City name:"+name);
	}
}
public class HybridInterface
{

	public static void main(String[] args)
	{
		india3 opp=new india3();
		opp.showstatename("karnataka");
		opp.showdistrictsname("Tumkur");
		opp.showtalukname("CN halli");
		opp.showvillagename("Thimmanahalli");
		opp.showcity("Bangalore");

	}

}
