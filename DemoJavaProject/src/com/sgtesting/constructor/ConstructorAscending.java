package com.sgtesting.constructor;
class Ascending
{
	Ascending(int a[])
	{
		for (int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>=a[j])
                {
                    int first=a[i];
                    a[i]=a[j];
                    a[j]=first;
                }
			}
			  System.out.println(a[i]);
		}
	}
}
public class ConstructorAscending 
{

	public static void main(String[] args) 
	{
		int a[]= {40,34,65,8,40};
		new Ascending (a);
	}

}
