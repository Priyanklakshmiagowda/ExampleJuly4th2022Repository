package com.sgtesting.constructormethods;

class SumDemo
{
	int addition()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			 sum=(sum+i);
		}
		return sum;
		
	}
}
public class SumReturn 
{

	public static void main(String[] args)
	{
		SumDemo O2=new SumDemo();
		int k=O2.addition();
		System.out.println(k);
	}

}
