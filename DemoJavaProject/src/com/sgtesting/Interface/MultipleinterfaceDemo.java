package com.sgtesting.Interface;
interface state1
{
	void showstatename(String name);
}
interface districts1 
{
	void showdistrictsname(String name);
	
}
interface taluk1 extends state1,districts1 
{
	void showtalukname(String name);
	
}
class india1 implements  taluk
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
public class MultipleinterfaceDemo {

	public static void main(String[] args) {
		india1 o1=new india1();
		o1.showstatename("karnataka");
		o1.showdistrictsname("Tumkur");
		o1.showtalukname("CN halli");
		o1.showcity("Bangalor");

	}

}
