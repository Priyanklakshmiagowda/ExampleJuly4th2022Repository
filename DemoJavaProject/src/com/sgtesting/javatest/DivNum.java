package com.sgtesting.javatest;

class FourthTable
{
	int[] table()
	{
		int res[]=new int[10];
		int c=4;
		int j=0;
		for(int i=1;i<=10;i++)
		{
			res[j]=c*i;
			j++;
		
		}
		return res;
		
	}
	
}
public class DivNum 
{

	public static void main(String[] args)
	{
		FourthTable hh=new FourthTable();
		int k[]=hh.table();
		for(int kk:k)
		{
			System.out.println(kk);
		}

	}

}
