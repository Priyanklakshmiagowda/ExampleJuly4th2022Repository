package com.sgtesting.javatest;
class Numbers
{
	int[] div()
	{
		int[] res=new int[10];
		int j=0;
		for(int i=1;i<=30;i++)
		{
			if(i%3==0)
			{
				res[j]=i;
				j++;
			}
		}
		return res;
	}
}
public class NumbersDivDemo 
{

	public static void main(String[] args) 
	{
		Numbers jj=new Numbers();
		int []k=jj.div();
		for(int pp:k)
		{
			System.out.println(pp);
		}

	}

}
