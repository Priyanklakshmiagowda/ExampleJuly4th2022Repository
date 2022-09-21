package com.sgtesting.constructor;
class Laptop
{
	Laptop(String OS,String processor)
	{
		System.out.println("Operating System:"+OS);
		System.out.println("Processor:"+processor);
	}
	Laptop(int rs)
	{
		System.out.println("price of the laptop:"+rs);
	}
}
public class ConstructorOverloadingLapto
{

	public static void main(String[] args) 
	{
		Laptop obj1=new Laptop("Windows System","Intel");
		Laptop obj2=new Laptop(50000);

	}

}
