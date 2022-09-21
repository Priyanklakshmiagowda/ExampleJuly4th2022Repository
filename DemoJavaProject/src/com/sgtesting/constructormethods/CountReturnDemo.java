package com.sgtesting.constructormethods;
class Division
{
	int div()
	{
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%6==0)
			{
				count=count+1;
			}
		}
		return count;
		
	}
}
public class CountReturnDemo 
{

	public static void main(String[] args)
	{
		Division o6=new Division();
		int kk=o6.div();
		System.out.println(kk);

	}

}
