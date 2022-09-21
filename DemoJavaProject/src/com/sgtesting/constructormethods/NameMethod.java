package com.sgtesting.constructormethods;
class Print
{
	String Name(String x)
	{
		String name=x;
		return name;
		
	}
}
public class NameMethod 
{

	public static void main(String[] args)
	{
		Print p=new Print();
		String z=p.Name("Priyanka");
		System.out.println(z);

	}

}
