package com.sgtesting.constructormethods;
class EvenDemo
{
	int evenaddition()
	{
		int sum=0;
		for(int i=250;i<=350;i++)
		{
			if(i%2==0)
			{
				sum=sum+1;
			}
		}
		return sum;
		
	}
}

public class EvenNumbersReturn 
{

	public static void main(String[] args)
	{
		EvenDemo o4=new EvenDemo();
		int j=o4.evenaddition();
		System.out.println(j);
		

	}

}
