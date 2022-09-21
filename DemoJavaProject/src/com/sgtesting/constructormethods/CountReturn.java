package com.sgtesting.constructormethods;
class CountDemo
{
	int cal()
	{
		int sum=0;
		for(int i=91;i>=31;i--)
		{
			if(i%2==1)
			{
				sum=sum+1;
			}
			
		}
		return sum;
	}
}
public class CountReturn 
{

	public static void main(String[] args) 
	{
		CountDemo o3=new CountDemo();
		int l=o3.cal();
		System.out.println(l);
		

	}

}
