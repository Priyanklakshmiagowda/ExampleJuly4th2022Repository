package com.sgtesting.constructormethods;
class Factorial
{
	int read(int num)
	{
		
		int  fact=1;
	
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
		
public class FactorialReturn 
{

	public static void main(String[] args) 
	{
	
		Factorial O1=new Factorial();
		int p=O1.read(4);
		System.out.println(p);

	}

}
