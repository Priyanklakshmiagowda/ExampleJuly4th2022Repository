package com.sgtesting.javatest;
class Array
{
	int[] read()
	{
		int a[]=new int[10];
		int k=4;
		int j=0;
		for(int i=1;i<=10;i++)
		{
			a[j]=(i*k);
			j++;
		}
		return a;
		
	}
	

}
	
public class FruitsDemoint
{
	

	public static void main(String[] args) 
	{
		Array nn=new Array();
		int kk[]=nn.read();
		for(int pp:kk)
		{
		System.out.println(pp);
		}
		
	
	
	} 

}
