package com.sgtesting.constructor;
class Resultantarray
{
	Resultantarray(int a[],int b[])
	{
		int k=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[k]=b[j];
			k+=1;
		}
		for(int z=0;z<=c.length-1;z++)
		{
			System.out.println(c[z]);
		}
	}
}

public class ConstructorResultant 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,30,40};
		int b[]= {30,40,50,50};
		
		
		Resultantarray obj1=new Resultantarray(a,b);

	}

}
