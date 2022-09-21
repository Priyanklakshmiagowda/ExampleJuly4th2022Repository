package com.sgtesting.constructormethods;
class HalfArrayDemo
{
	int[] division()
	{
		int a[]= {10,11,12,15,8,9};
		int b[]=new int[a.length/2];
		for(int i=0;i<a.length/2;i++)
			         //b.length
		{
			b[i]=a[i];
			
		}
		return b;
	}
}

public class ArrayReturnDemo
{

	public static void main(String[] args) 
	{
		HalfArrayDemo o8=new HalfArrayDemo();
		int[] p=o8.division();
		for(int kk:p)
		{
			System.out.println(kk);
		}
	}

}
