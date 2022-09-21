package com.sgtesting.Interface;
abstract class state99
{
	abstract void showstatename(String name);
}
interface districts19
{
	void showdistrictsname(String name);
	
}
interface taluk19 
{
	void showtalukname(String name);
}

class india44 extends state99 implements districts19, taluk19
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
	void showcity44(String name)
	{
		System.out.println("City name:"+name);
	}
	
}
	
public class MultipleinheritanceDemo2 
{

	public static void main(String[] args) 
	{
		india44 oo=new india44();
		oo.showstatename("karnataka");
		oo.showdistrictsname("tumkur");
		oo.showtalukname("CNhalli");
		oo.showcity44("Banagalore");

	}

}
